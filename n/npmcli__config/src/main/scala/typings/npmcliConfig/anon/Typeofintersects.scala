package typings.npmcliConfig.anon

import typings.semver.classesRangeMod.^
import typings.semver.mod.RangeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofintersects extends StObject {
  
  /**
    * Return true if any of the ranges comparators intersect
    */
  def apply(range1: String, range2: String): Boolean = js.native
  def apply(range1: String, range2: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(range1: String, range2: String, optionsOrLoose: RangeOptions): Boolean = js.native
  def apply(range1: String, range2: ^): Boolean = js.native
  def apply(range1: String, range2: ^, optionsOrLoose: Boolean): Boolean = js.native
  def apply(range1: String, range2: ^, optionsOrLoose: RangeOptions): Boolean = js.native
  def apply(range1: ^, range2: String): Boolean = js.native
  def apply(range1: ^, range2: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(range1: ^, range2: String, optionsOrLoose: RangeOptions): Boolean = js.native
  def apply(range1: ^, range2: ^): Boolean = js.native
  def apply(range1: ^, range2: ^, optionsOrLoose: Boolean): Boolean = js.native
  def apply(range1: ^, range2: ^, optionsOrLoose: RangeOptions): Boolean = js.native
}
