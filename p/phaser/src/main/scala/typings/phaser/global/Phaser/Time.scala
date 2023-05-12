package typings.phaser.global.Phaser

import typings.phaser.Phaser.Types.Time.TimelineEventConfig
import typings.phaser.Phaser.Types.Time.TimerEventConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Time {
  
  /**
    * The Clock is a Scene plugin which creates and updates Timer Events for its Scene.
    */
  @JSGlobal("Phaser.Time.Clock")
  @js.native
  open class Clock protected ()
    extends StObject
       with typings.phaser.Phaser.Time.Clock {
    /**
      * 
      * @param scene The Scene which owns this Clock.
      */
    def this(scene: typings.phaser.Phaser.Scene) = this()
  }
  
  /**
    * A Timeline is a way to schedule events to happen at specific times in the future.
    * 
    * You can think of it as an event sequencer for your game, allowing you to schedule the
    * running of callbacks, events and other actions at specific times in the future.
    * 
    * A Timeline is a Scene level system, meaning you can have as many Timelines as you like, each
    * belonging to a different Scene. You can also have multiple Timelines running at the same time.
    * 
    * If the Scene is paused, the Timeline will also pause. If the Scene is destroyed, the Timeline
    * will be automatically destroyed. However, you can control the Timeline directly, pausing,
    * resuming and stopping it at any time.
    * 
    * Create an instance of a Timeline via the Game Object Factory:
    * 
    * ```js
    * const timeline = this.add.timeline();
    * ```
    * 
    * The Timeline always starts paused. You must call `play` on it to start it running.
    * 
    * You can also pass in a configuration object on creation, or an array of them:
    * 
    * ```js
    * const timeline = this.add.timeline({
    *     at: 1000,
    *     run: () => {
    *         this.add.sprite(400, 300, 'logo');
    *     }
    * });
    * 
    * timeline.play();
    * ```
    * 
    * In this example we sequence a few different events:
    * 
    * ```js
    * const timeline = this.add.timeline([
    *     {
    *         at: 1000,
    *         run: () => { this.logo = this.add.sprite(400, 300, 'logo'); },
    *         sound: 'TitleMusic'
    *     },
    *     {
    *         at: 2500,
    *         tween: {
    *             targets: this.logo,
    *             y: 600,
    *             yoyo: true
    *         },
    *         sound: 'Explode'
    *     },
    *     {
    *         at: 8000,
    *         event: 'HURRY_PLAYER',
    *         target: this.background,
    *         set: {
    *             tint: 0xff0000
    *         }
    *     }
    * ]);
    * 
    * timeline.play();
    * ```
    * 
    * There are lots of options available to you via the configuration object. See the
    * {@link Phaser.Types.Time.TimelineEventConfig} typedef for more details.
    */
  @JSGlobal("Phaser.Time.Timeline")
  @js.native
  open class Timeline protected ()
    extends StObject
       with typings.phaser.Phaser.Time.Timeline {
    def this(scene: typings.phaser.Phaser.Scene, config: js.Array[TimelineEventConfig]) = this()
    /**
      * 
      * @param scene The Scene which owns this Timeline.
      * @param config The configuration object for this Timeline Event, or an array of them.
      */
    def this(scene: typings.phaser.Phaser.Scene, config: TimelineEventConfig) = this()
  }
  
  /**
    * A Timer Event represents a delayed function call. It's managed by a Scene's {@link Clock} and will call its function after a set amount of time has passed. The Timer Event can optionally repeat - i.e. call its function multiple times before finishing, or loop indefinitely.
    * 
    * Because it's managed by a Clock, a Timer Event is based on game time, will be affected by its Clock's time scale, and will pause if its Clock pauses.
    */
  @JSGlobal("Phaser.Time.TimerEvent")
  @js.native
  open class TimerEvent protected ()
    extends StObject
       with typings.phaser.Phaser.Time.TimerEvent {
    /**
      * 
      * @param config The configuration for the Timer Event, including its delay and callback.
      */
    def this(config: TimerEventConfig) = this()
  }
}
