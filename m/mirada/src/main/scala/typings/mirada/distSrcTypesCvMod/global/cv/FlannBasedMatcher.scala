package typings.mirada.distSrcTypesCvMod.global.cv

import typings.mirada.anon.TypeofFlannBasedMatcher
import typings.mirada.distSrcTypesCvMod.global.cv.^
import typings.mirada.distSrcTypesOpencvHacksMod.Ptr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("cv.FlannBasedMatcher")
@js.native
open class FlannBasedMatcher ()
  extends typings.mirada.distSrcTypesOpencvTypesMod.FlannBasedMatcher {
  def this(indexParams: Ptr) = this()
  def this(indexParams: Unit, searchParams: Ptr) = this()
  def this(indexParams: Ptr, searchParams: Ptr) = this()
}
object FlannBasedMatcher {
  
  inline def apply: TypeofFlannBasedMatcher = ^.asInstanceOf[js.Dynamic].selectDynamic("FlannBasedMatcher").asInstanceOf[TypeofFlannBasedMatcher]
}
