package typings.mirada.distSrcTypesCvMod.global.cv

import typings.mirada.anon.TypeofBFMatcher
import typings.mirada.distSrcTypesCvMod.global.cv.^
import typings.mirada.distSrcTypesOpencvHacksMod.bool
import typings.mirada.distSrcTypesOpencvHacksMod.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("cv.BFMatcher")
@js.native
open class BFMatcher ()
  extends typings.mirada.distSrcTypesOpencvTypesMod.BFMatcher {
  def this(normType: int) = this()
  def this(normType: Unit, crossCheck: bool) = this()
  def this(normType: int, crossCheck: bool) = this()
}
object BFMatcher {
  
  inline def apply: TypeofBFMatcher = ^.asInstanceOf[js.Dynamic].selectDynamic("BFMatcher").asInstanceOf[TypeofBFMatcher]
}
