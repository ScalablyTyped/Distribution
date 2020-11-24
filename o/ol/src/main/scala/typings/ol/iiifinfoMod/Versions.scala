package typings.ol.iiifinfoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Versions extends js.Object
@JSImport("ol/format/IIIFInfo", "Versions")
@js.native
object Versions extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Versions with String] = js.native
  
  @js.native
  sealed trait VERSION1 extends Versions
  /* "version1" */ @js.native
  object VERSION1 extends TopLevel[VERSION1 with String]
  
  @js.native
  sealed trait VERSION2 extends Versions
  /* "version2" */ @js.native
  object VERSION2 extends TopLevel[VERSION2 with String]
  
  @js.native
  sealed trait VERSION3 extends Versions
  /* "version3" */ @js.native
  object VERSION3 extends TopLevel[VERSION3 with String]
}
