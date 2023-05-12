package typings.npmcliConfig.anon

import typings.semver.classesRangeMod.^
import typings.semver.mod.RangeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofsubset extends StObject {
  
  /**
    * Return true if the subRange range is entirely contained by the superRange range.
    */
  def apply(sub: String, dom: String): Boolean = js.native
  def apply(sub: String, dom: String, options: RangeOptions): Boolean = js.native
  def apply(sub: String, dom: ^): Boolean = js.native
  def apply(sub: String, dom: ^, options: RangeOptions): Boolean = js.native
  def apply(sub: ^, dom: String): Boolean = js.native
  def apply(sub: ^, dom: String, options: RangeOptions): Boolean = js.native
  def apply(sub: ^, dom: ^): Boolean = js.native
  def apply(sub: ^, dom: ^, options: RangeOptions): Boolean = js.native
}
