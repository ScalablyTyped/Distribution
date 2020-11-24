package typings.phaser.global.Phaser

import typings.phaser.Phaser.Types.Time.TimerEventConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Phaser.Time")
@js.native
object Time extends js.Object {
  
  /**
    * The Clock is a Scene plugin which creates and updates Timer Events for its Scene.
    */
  @js.native
  class Clock protected ()
    extends typings.phaser.Phaser.Time.Clock {
    /**
      * 
      * @param scene The Scene which owns this Clock.
      */
    def this(scene: typings.phaser.Phaser.Scene) = this()
  }
  
  /**
    * A Timer Event represents a delayed function call. It's managed by a Scene's {@link Clock} and will call its function after a set amount of time has passed. The Timer Event can optionally repeat - i.e. call its function multiple times before finishing, or loop indefinitely.
    * 
    * Because it's managed by a Clock, a Timer Event is based on game time, will be affected by its Clock's time scale, and will pause if its Clock pauses.
    */
  @js.native
  class TimerEvent protected ()
    extends typings.phaser.Phaser.Time.TimerEvent {
    /**
      * 
      * @param config The configuration for the Timer Event, including its delay and callback.
      */
    def this(config: TimerEventConfig) = this()
  }
}
