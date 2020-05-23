package typings.pixiJs.mod

import typings.pixiJs.anon.AutoPreventDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This namespace contains a renderer plugin for handling mouse, pointer, and touch events.
  *
  * Do not instantiate this plugin directly. It is available from the `renderer.plugins` property.
  * See {@link PIXI.CanvasRenderer#plugins} or {@link PIXI.Renderer#plugins}.
  * @namespace PIXI.interaction
  */
@JSImport("pixi.js", "interaction")
@js.native
object interaction extends js.Object {
  /**
    * Holds all information related to an Interaction event
    *
    * @class
    * @memberof PIXI.interaction
    */
  @js.native
  class InteractionData ()
    extends typings.pixiJs.PIXI.interaction.InteractionData
  
  /**
    * Event class that mimics native DOM events.
    *
    * @class
    * @memberof PIXI.interaction
    */
  @js.native
  class InteractionEvent ()
    extends typings.pixiJs.PIXI.interaction.InteractionEvent {
    /**
      * The object whose event listener’s callback is currently being invoked.
      *
      * @member {PIXI.DisplayObject} PIXI.interaction.InteractionEvent#currentTarget
      */
    /* CompleteClass */
    override var currentTarget: typings.pixiJs.PIXI.DisplayObject = js.native
    /**
      * InteractionData related to this event
      *
      * @member {PIXI.interaction.InteractionData} PIXI.interaction.InteractionEvent#data
      */
    /* CompleteClass */
    override var data: typings.pixiJs.PIXI.interaction.InteractionData = js.native
    /**
      * Whether this event will continue propagating in the tree.
      *
      * Remaining events for the {@link stopsPropagatingAt} object
      * will still be dispatched.
      *
      * @member {boolean} PIXI.interaction.InteractionEvent#stopped
      */
    /* CompleteClass */
    override var stopped: Boolean = js.native
    /**
      * The object which caused this event to be dispatched.
      * For listener callback see {@link PIXI.interaction.InteractionEvent.currentTarget}.
      *
      * @member {PIXI.DisplayObject} PIXI.interaction.InteractionEvent#target
      */
    /* CompleteClass */
    override var target: typings.pixiJs.PIXI.DisplayObject = js.native
    /**
      * Type of the event
      *
      * @member {string} PIXI.interaction.InteractionEvent#type
      */
    /* CompleteClass */
    override var `type`: String = js.native
    /**
      * Resets the event.
      */
    /* CompleteClass */
    override def reset(): Unit = js.native
    /**
      * Prevents event from reaching any objects other than the current object.
      *
      */
    /* CompleteClass */
    override def stopPropagation(): Unit = js.native
  }
  
  /**
    * The interaction manager deals with mouse, touch and pointer events.
    *
    * Any DisplayObject can be interactive if its `interactive` property is set to true.
    *
    * This manager also supports multitouch.
    *
    * An instance of this class is automatically created by default, and can be found at `renderer.plugins.interaction`
    *
    * @class
    * @extends PIXI.utils.EventEmitter
    * @memberof PIXI.interaction
    */
  @js.native
  class InteractionManager protected ()
    extends typings.pixiJs.PIXI.interaction.InteractionManager {
    def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
    def this(renderer: typings.pixiJs.PIXI.Renderer, options: AutoPreventDefault) = this()
  }
  
}

