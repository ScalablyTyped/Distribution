package typings.pixiDotJs.PIXI.loaders.Resource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TYPE extends js.Object

@JSGlobal("PIXI.loaders.Resource.TYPE")
@js.native
object TYPE extends js.Object {
  @js.native
  sealed trait AUDIO extends TYPE
  
  @js.native
  sealed trait IMAGE extends TYPE
  
  @js.native
  sealed trait JSON extends TYPE
  
  @js.native
  sealed trait TEXT extends TYPE
  
  @js.native
  sealed trait UNKNOWN extends TYPE
  
  @js.native
  sealed trait VIDEO extends TYPE
  
  @js.native
  sealed trait XML extends TYPE
  
  /* 4 */ val AUDIO: typings.pixiDotJs.PIXI.loaders.Resource.TYPE.AUDIO with Double = js.native
  /* 3 */ val IMAGE: typings.pixiDotJs.PIXI.loaders.Resource.TYPE.IMAGE with Double = js.native
  /* 1 */ val JSON: typings.pixiDotJs.PIXI.loaders.Resource.TYPE.JSON with Double = js.native
  /* 6 */ val TEXT: typings.pixiDotJs.PIXI.loaders.Resource.TYPE.TEXT with Double = js.native
  /* 0 */ val UNKNOWN: typings.pixiDotJs.PIXI.loaders.Resource.TYPE.UNKNOWN with Double = js.native
  /* 5 */ val VIDEO: typings.pixiDotJs.PIXI.loaders.Resource.TYPE.VIDEO with Double = js.native
  /* 2 */ val XML: typings.pixiDotJs.PIXI.loaders.Resource.TYPE.XML with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TYPE with Double] = js.native
}

