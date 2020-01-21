package typings.ol.bufferMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BufferUsage extends js.Object

@JSImport("ol/webgl/Buffer", "BufferUsage")
@js.native
object BufferUsage extends js.Object {
  @js.native
  sealed trait DYNAMIC_DRAW extends BufferUsage
  
  @js.native
  sealed trait STATIC_DRAW extends BufferUsage
  
  @js.native
  sealed trait STREAM_DRAW extends BufferUsage
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BufferUsage with Double] = js.native
  /* 35048 */ @js.native
  object DYNAMIC_DRAW extends TopLevel[DYNAMIC_DRAW with Double]
  
  /* 35044 */ @js.native
  object STATIC_DRAW extends TopLevel[STATIC_DRAW with Double]
  
  /* 35040 */ @js.native
  object STREAM_DRAW extends TopLevel[STREAM_DRAW with Double]
  
}

