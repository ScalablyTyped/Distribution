package typings.pixiJs.global.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CountLimiter limits the number of items handled by a {@link PIXI.BasePrepare} to a specified
  * number of items per frame.
  *
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.CountLimiter")
@js.native
class CountLimiter protected ()
  extends StObject
     with typings.pixiJs.PIXI.CountLimiter {
  def this(maxItemsPerFrame: Double) = this()
  
  /**
    * Checks to see if another item can be uploaded. This should only be called once per item.
    * @return {boolean} If the item is allowed to be uploaded.
    */
  /* CompleteClass */
  override def allowedToUpload(): Boolean = js.native
  
  /**
    * Resets any counting properties to start fresh on a new frame.
    */
  /* CompleteClass */
  override def beginFrame(): Unit = js.native
}
