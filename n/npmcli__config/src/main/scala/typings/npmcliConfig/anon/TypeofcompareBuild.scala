package typings.npmcliConfig.anon

import typings.npmcliConfig.npmcliConfigInts.`-1`
import typings.npmcliConfig.npmcliConfigInts.`0`
import typings.npmcliConfig.npmcliConfigInts.`1`
import typings.semver.classesSemverMod.^
import typings.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofcompareBuild extends StObject {
  
  /**
    * Compares two versions including build identifiers (the bit after `+` in the semantic version string).
    *
    * Sorts in ascending order when passed to `Array.sort()`.
    *
    * @return
    * - `0` if `v1` == `v2`
    * - `1` if `v1` is greater
    * - `-1` if `v2` is greater.
    *
    * @since 6.1.0
    */
  def apply(a: String, b: String): `1` | `0` | `-1` = js.native
  def apply(a: String, b: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  def apply(a: String, b: String, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  def apply(a: String, b: ^): `1` | `0` | `-1` = js.native
  def apply(a: String, b: ^, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  def apply(a: String, b: ^, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  def apply(a: ^, b: String): `1` | `0` | `-1` = js.native
  def apply(a: ^, b: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  def apply(a: ^, b: String, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  def apply(a: ^, b: ^): `1` | `0` | `-1` = js.native
  def apply(a: ^, b: ^, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  def apply(a: ^, b: ^, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
}
