package typings.npmcliConfig.anon

import typings.npmcliConfig.npmcliConfigStrings.Greaterthansign
import typings.npmcliConfig.npmcliConfigStrings.Lessthansign
import typings.semver.classesRangeMod.^
import typings.semver.mod.RangeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoutside extends StObject {
  
  /**
    * Return true if the version is outside the bounds of the range in either the high or low direction.
    * The hilo argument must be either the string '>' or '<'. (This is the function called by gtr and ltr.)
    */
  def apply(version: String, range: String, hilo: Greaterthansign | Lessthansign): Boolean = js.native
  def apply(version: String, range: String, hilo: Greaterthansign | Lessthansign, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: String, range: String, hilo: Greaterthansign | Lessthansign, optionsOrLoose: RangeOptions): Boolean = js.native
  def apply(version: String, range: ^, hilo: Greaterthansign | Lessthansign): Boolean = js.native
  def apply(version: String, range: ^, hilo: Greaterthansign | Lessthansign, optionsOrLoose: Boolean): Boolean = js.native
  def apply(version: String, range: ^, hilo: Greaterthansign | Lessthansign, optionsOrLoose: RangeOptions): Boolean = js.native
  def apply(version: typings.semver.classesSemverMod.^, range: String, hilo: Greaterthansign | Lessthansign): Boolean = js.native
  def apply(
    version: typings.semver.classesSemverMod.^,
    range: String,
    hilo: Greaterthansign | Lessthansign,
    optionsOrLoose: Boolean
  ): Boolean = js.native
  def apply(
    version: typings.semver.classesSemverMod.^,
    range: String,
    hilo: Greaterthansign | Lessthansign,
    optionsOrLoose: RangeOptions
  ): Boolean = js.native
  def apply(version: typings.semver.classesSemverMod.^, range: ^, hilo: Greaterthansign | Lessthansign): Boolean = js.native
  def apply(
    version: typings.semver.classesSemverMod.^,
    range: ^,
    hilo: Greaterthansign | Lessthansign,
    optionsOrLoose: Boolean
  ): Boolean = js.native
  def apply(
    version: typings.semver.classesSemverMod.^,
    range: ^,
    hilo: Greaterthansign | Lessthansign,
    optionsOrLoose: RangeOptions
  ): Boolean = js.native
}
