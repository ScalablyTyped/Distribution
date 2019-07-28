package typings.phaser.PhaserNs.ScenesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Scenes.Events")
@js.native
object EventsNs extends js.Object {
  /**
    * The Scene Systems Boot Event.
    * 
    * This event is dispatched by a Scene during the Scene Systems boot process. Primarily used by Scene Plugins.
    * 
    * Listen to it from a Scene using `this.scene.events.on('boot', listener)`.
    */
  val BOOT: js.Any = js.native
  /**
    * The Scene Create Event.
    * 
    * This event is dispatched by a Scene after it has been created by the Scene Manager.
    * 
    * If a Scene has a `create` method then this event is emitted _after_ that has run.
    * 
    * If there is a transition, this event will be fired after the `TRANSITION_START` event.
    * 
    * Listen to it from a Scene using `this.scene.events.on('create', listener)`.
    */
  val CREATE: js.Any = js.native
  /**
    * The Scene Systems Destroy Event.
    * 
    * This event is dispatched by a Scene during the Scene Systems destroy process.
    * 
    * Listen to it from a Scene using `this.scene.events.on('destroy', listener)`.
    * 
    * You should destroy any resources that may be in use by your Scene in this event handler.
    */
  val DESTROY: js.Any = js.native
  /**
    * The Scene Systems Pause Event.
    * 
    * This event is dispatched by a Scene when it is paused, either directly via the `pause` method, or as an
    * action from another Scene.
    * 
    * Listen to it from a Scene using `this.scene.events.on('pause', listener)`.
    */
  val PAUSE: js.Any = js.native
  /**
    * The Scene Systems Post Update Event.
    * 
    * This event is dispatched by a Scene during the main game loop step.
    * 
    * The event flow for a single step of a Scene is as follows:
    * 
    * 1. [PRE_UPDATE]{@linkcode Phaser.Scenes.Events#event:PRE_UPDATE}
    * 2. [UPDATE]{@linkcode Phaser.Scenes.Events#event:UPDATE}
    * 3. The `Scene.update` method is called, if it exists
    * 4. [POST_UPDATE]{@linkcode Phaser.Scenes.Events#event:POST_UPDATE}
    * 5. [RENDER]{@linkcode Phaser.Scenes.Events#event:RENDER}
    * 
    * Listen to it from a Scene using `this.scene.events.on('postupdate', listener)`.
    * 
    * A Scene will only run its step if it is active.
    */
  val POST_UPDATE: js.Any = js.native
  /**
    * The Scene Systems Pre Update Event.
    * 
    * This event is dispatched by a Scene during the main game loop step.
    * 
    * The event flow for a single step of a Scene is as follows:
    * 
    * 1. [PRE_UPDATE]{@linkcode Phaser.Scenes.Events#event:PRE_UPDATE}
    * 2. [UPDATE]{@linkcode Phaser.Scenes.Events#event:UPDATE}
    * 3. The `Scene.update` method is called, if it exists
    * 4. [POST_UPDATE]{@linkcode Phaser.Scenes.Events#event:POST_UPDATE}
    * 5. [RENDER]{@linkcode Phaser.Scenes.Events#event:RENDER}
    * 
    * Listen to it from a Scene using `this.scene.events.on('preupdate', listener)`.
    * 
    * A Scene will only run its step if it is active.
    */
  val PRE_UPDATE: js.Any = js.native
  /**
    * The Scene Systems Ready Event.
    * 
    * This event is dispatched by a Scene during the Scene Systems start process.
    * By this point in the process the Scene is now fully active and rendering.
    * This event is meant for your game code to use, as all plugins have responded to the earlier 'start' event.
    * 
    * Listen to it from a Scene using `this.scene.events.on('ready', listener)`.
    */
  val READY: js.Any = js.native
  /**
    * The Scene Systems Render Event.
    * 
    * This event is dispatched by a Scene during the main game loop step.
    * 
    * The event flow for a single step of a Scene is as follows:
    * 
    * 1. [PRE_UPDATE]{@linkcode Phaser.Scenes.Events#event:PRE_UPDATE}
    * 2. [UPDATE]{@linkcode Phaser.Scenes.Events#event:UPDATE}
    * 3. The `Scene.update` method is called, if it exists
    * 4. [POST_UPDATE]{@linkcode Phaser.Scenes.Events#event:POST_UPDATE}
    * 5. [RENDER]{@linkcode Phaser.Scenes.Events#event:RENDER}
    * 
    * Listen to it from a Scene using `this.scene.events.on('render', listener)`.
    * 
    * A Scene will only render if it is visible and active.
    * By the time this event is dispatched, the Scene will have already been rendered.
    */
  val RENDER: js.Any = js.native
  /**
    * The Scene Systems Resume Event.
    * 
    * This event is dispatched by a Scene when it is resumed from a paused state, either directly via the `resume` method,
    * or as an action from another Scene.
    * 
    * Listen to it from a Scene using `this.scene.events.on('resume', listener)`.
    */
  val RESUME: js.Any = js.native
  /**
    * The Scene Systems Shutdown Event.
    * 
    * This event is dispatched by a Scene during the Scene Systems shutdown process.
    * 
    * Listen to it from a Scene using `this.scene.events.on('shutdown', listener)`.
    * 
    * You should free-up any resources that may be in use by your Scene in this event handler, on the understanding
    * that the Scene may, at any time, become active again. A shutdown Scene is not 'destroyed', it's simply not
    * currently active. Use the [DESTROY]{@linkcode Phaser.Scenes.Events#event:DESTROY} event to completely clear resources.
    */
  val SHUTDOWN: js.Any = js.native
  /**
    * The Scene Systems Sleep Event.
    * 
    * This event is dispatched by a Scene when it is sent to sleep, either directly via the `sleep` method,
    * or as an action from another Scene.
    * 
    * Listen to it from a Scene using `this.scene.events.on('sleep', listener)`.
    */
  val SLEEP: js.Any = js.native
  /**
    * The Scene Systems Start Event.
    * 
    * This event is dispatched by a Scene during the Scene Systems start process. Primarily used by Scene Plugins.
    * 
    * Listen to it from a Scene using `this.scene.events.on('start', listener)`.
    */
  val START: js.Any = js.native
  /**
    * The Scene Transition Complete Event.
    * 
    * This event is dispatched by the Target Scene of a transition.
    * 
    * It happens when the transition process has completed. This occurs when the duration timer equals or exceeds the duration
    * of the transition.
    * 
    * Listen to it from a Scene using `this.scene.events.on('transitioncomplete', listener)`.
    * 
    * The Scene Transition event flow is as follows:
    * 
    * 1. [TRANSITION_OUT]{@linkcode Phaser.Scenes.Events#event:TRANSITION_OUT} - the Scene that started the transition will emit this event.
    * 2. [TRANSITION_INIT]{@linkcode Phaser.Scenes.Events#event:TRANSITION_INIT} - the Target Scene will emit this event if it has an `init` method.
    * 3. [TRANSITION_START]{@linkcode Phaser.Scenes.Events#event:TRANSITION_START} - the Target Scene will emit this event after its `create` method is called, OR ...
    * 4. [TRANSITION_WAKE]{@linkcode Phaser.Scenes.Events#event:TRANSITION_WAKE} - the Target Scene will emit this event if it was asleep and has been woken-up to be transitioned to.
    * 5. [TRANSITION_COMPLETE]{@linkcode Phaser.Scenes.Events#event:TRANSITION_COMPLETE} - the Target Scene will emit this event when the transition finishes.
    */
  val TRANSITION_COMPLETE: js.Any = js.native
  /**
    * The Scene Transition Init Event.
    * 
    * This event is dispatched by the Target Scene of a transition.
    * 
    * It happens immediately after the `Scene.init` method is called. If the Scene does not have an `init` method,
    * this event is not dispatched.
    * 
    * Listen to it from a Scene using `this.scene.events.on('transitioninit', listener)`.
    * 
    * The Scene Transition event flow is as follows:
    * 
    * 1. [TRANSITION_OUT]{@linkcode Phaser.Scenes.Events#event:TRANSITION_OUT} - the Scene that started the transition will emit this event.
    * 2. [TRANSITION_INIT]{@linkcode Phaser.Scenes.Events#event:TRANSITION_INIT} - the Target Scene will emit this event if it has an `init` method.
    * 3. [TRANSITION_START]{@linkcode Phaser.Scenes.Events#event:TRANSITION_START} - the Target Scene will emit this event after its `create` method is called, OR ...
    * 4. [TRANSITION_WAKE]{@linkcode Phaser.Scenes.Events#event:TRANSITION_WAKE} - the Target Scene will emit this event if it was asleep and has been woken-up to be transitioned to.
    * 5. [TRANSITION_COMPLETE]{@linkcode Phaser.Scenes.Events#event:TRANSITION_COMPLETE} - the Target Scene will emit this event when the transition finishes.
    */
  val TRANSITION_INIT: js.Any = js.native
  /**
    * The Scene Transition Out Event.
    * 
    * This event is dispatched by a Scene when it initiates a transition to another Scene.
    * 
    * Listen to it from a Scene using `this.scene.events.on('transitionout', listener)`.
    * 
    * The Scene Transition event flow is as follows:
    * 
    * 1. [TRANSITION_OUT]{@linkcode Phaser.Scenes.Events#event:TRANSITION_OUT} - the Scene that started the transition will emit this event.
    * 2. [TRANSITION_INIT]{@linkcode Phaser.Scenes.Events#event:TRANSITION_INIT} - the Target Scene will emit this event if it has an `init` method.
    * 3. [TRANSITION_START]{@linkcode Phaser.Scenes.Events#event:TRANSITION_START} - the Target Scene will emit this event after its `create` method is called, OR ...
    * 4. [TRANSITION_WAKE]{@linkcode Phaser.Scenes.Events#event:TRANSITION_WAKE} - the Target Scene will emit this event if it was asleep and has been woken-up to be transitioned to.
    * 5. [TRANSITION_COMPLETE]{@linkcode Phaser.Scenes.Events#event:TRANSITION_COMPLETE} - the Target Scene will emit this event when the transition finishes.
    */
  val TRANSITION_OUT: js.Any = js.native
  /**
    * The Scene Transition Start Event.
    * 
    * This event is dispatched by the Target Scene of a transition, only if that Scene was not asleep.
    * 
    * It happens immediately after the `Scene.create` method is called. If the Scene does not have a `create` method,
    * this event is dispatched anyway.
    * 
    * If the Target Scene was sleeping then the [TRANSITION_WAKE]{@linkcode Phaser.Scenes.Events#event:TRANSITION_WAKE} event is
    * dispatched instead of this event.
    * 
    * Listen to it from a Scene using `this.scene.events.on('transitionstart', listener)`.
    * 
    * The Scene Transition event flow is as follows:
    * 
    * 1. [TRANSITION_OUT]{@linkcode Phaser.Scenes.Events#event:TRANSITION_OUT} - the Scene that started the transition will emit this event.
    * 2. [TRANSITION_INIT]{@linkcode Phaser.Scenes.Events#event:TRANSITION_INIT} - the Target Scene will emit this event if it has an `init` method.
    * 3. [TRANSITION_START]{@linkcode Phaser.Scenes.Events#event:TRANSITION_START} - the Target Scene will emit this event after its `create` method is called, OR ...
    * 4. [TRANSITION_WAKE]{@linkcode Phaser.Scenes.Events#event:TRANSITION_WAKE} - the Target Scene will emit this event if it was asleep and has been woken-up to be transitioned to.
    * 5. [TRANSITION_COMPLETE]{@linkcode Phaser.Scenes.Events#event:TRANSITION_COMPLETE} - the Target Scene will emit this event when the transition finishes.
    */
  val TRANSITION_START: js.Any = js.native
  /**
    * The Scene Transition Wake Event.
    * 
    * This event is dispatched by the Target Scene of a transition, only if that Scene was asleep before
    * the transition began. If the Scene was not asleep the [TRANSITION_START]{@linkcode Phaser.Scenes.Events#event:TRANSITION_START} event is dispatched instead.
    * 
    * Listen to it from a Scene using `this.scene.events.on('transitionwake', listener)`.
    * 
    * The Scene Transition event flow is as follows:
    * 
    * 1. [TRANSITION_OUT]{@linkcode Phaser.Scenes.Events#event:TRANSITION_OUT} - the Scene that started the transition will emit this event.
    * 2. [TRANSITION_INIT]{@linkcode Phaser.Scenes.Events#event:TRANSITION_INIT} - the Target Scene will emit this event if it has an `init` method.
    * 3. [TRANSITION_START]{@linkcode Phaser.Scenes.Events#event:TRANSITION_START} - the Target Scene will emit this event after its `create` method is called, OR ...
    * 4. [TRANSITION_WAKE]{@linkcode Phaser.Scenes.Events#event:TRANSITION_WAKE} - the Target Scene will emit this event if it was asleep and has been woken-up to be transitioned to.
    * 5. [TRANSITION_COMPLETE]{@linkcode Phaser.Scenes.Events#event:TRANSITION_COMPLETE} - the Target Scene will emit this event when the transition finishes.
    */
  val TRANSITION_WAKE: js.Any = js.native
  /**
    * The Scene Systems Update Event.
    * 
    * This event is dispatched by a Scene during the main game loop step.
    * 
    * The event flow for a single step of a Scene is as follows:
    * 
    * 1. [PRE_UPDATE]{@linkcode Phaser.Scenes.Events#event:PRE_UPDATE}
    * 2. [UPDATE]{@linkcode Phaser.Scenes.Events#event:UPDATE}
    * 3. The `Scene.update` method is called, if it exists
    * 4. [POST_UPDATE]{@linkcode Phaser.Scenes.Events#event:POST_UPDATE}
    * 5. [RENDER]{@linkcode Phaser.Scenes.Events#event:RENDER}
    * 
    * Listen to it from a Scene using `this.scene.events.on('update', listener)`.
    * 
    * A Scene will only run its step if it is active.
    */
  val UPDATE: js.Any = js.native
  /**
    * The Scene Systems Wake Event.
    * 
    * This event is dispatched by a Scene when it is woken from sleep, either directly via the `wake` method,
    * or as an action from another Scene.
    * 
    * Listen to it from a Scene using `this.scene.events.on('wake', listener)`.
    */
  val WAKE: js.Any = js.native
}

