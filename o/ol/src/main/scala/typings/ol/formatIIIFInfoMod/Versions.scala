package typings.ol.formatIIIFInfoMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Versions extends js.Object

@JSImport("ol/format/IIIFInfo", "Versions")
@js.native
object Versions extends js.Object {
  @js.native
  sealed trait VERSION1 extends Versions
  
  @js.native
  sealed trait VERSION2 extends Versions
  
  @js.native
  sealed trait VERSION3 extends Versions
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Versions with String] = js.native
  /* "version1" */ @js.native
  object VERSION1 extends TopLevel[VERSION1 with String]
  
  /* "version2" */ @js.native
  object VERSION2 extends TopLevel[VERSION2 with String]
  
  /* "version3" */ @js.native
  object VERSION3 extends TopLevel[VERSION3 with String]
  
}

