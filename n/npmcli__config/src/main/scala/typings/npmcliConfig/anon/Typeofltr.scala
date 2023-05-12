package typings.npmcliConfig.anon

import typings.semver.classesRangeMod.^
import typings.semver.mod.RangeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofltr extends StObject {
  
  /**
    * Return true if version is less than all the versions possible in the range.
    */
  def apply(version: String, range: String): Boolean = js.native
  def apply(version: String, range: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: String, range: String, optionsOrLoose: RangeOptions): Boolean = js.native
  def apply(version: String, range: ^): Boolean = js.native
  def apply(version: String, range: ^, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: String, range: ^, optionsOrLoose: RangeOptions): Boolean = js.native
  def apply(version: typings.semver.classesSemverMod.^, range: String): Boolean = js.native
  def apply(version: typings.semver.classesSemverMod.^, range: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: typings.semver.classesSemverMod.^, range: String, optionsOrLoose: RangeOptions): Boolean = js.native
  def apply(version: typings.semver.classesSemverMod.^, range: ^): Boolean = js.native
  def apply(version: typings.semver.classesSemverMod.^, range: ^, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: typings.semver.classesSemverMod.^, range: ^, optionsOrLoose: RangeOptions): Boolean = js.native
}
