package typings.npmcliConfig.anon

import typings.semver.classesSemverMod.^
import typings.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofeq extends StObject {
  
  /**
    * v1 == v2 This is true if they're logically equivalent, even if they're not the exact same string. You already know how to compare strings.
    */
  def apply(v1: String, v2: String): Boolean = js.native
  def apply(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(v1: String, v2: String, optionsOrLoose: Options): Boolean = js.native
  def apply(v1: String, v2: ^): Boolean = js.native
  def apply(v1: String, v2: ^, optionsOrLoose: Boolean): Boolean = js.native
  def apply(v1: String, v2: ^, optionsOrLoose: Options): Boolean = js.native
  def apply(v1: ^, v2: String): Boolean = js.native
  def apply(v1: ^, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(v1: ^, v2: String, optionsOrLoose: Options): Boolean = js.native
  def apply(v1: ^, v2: ^): Boolean = js.native
  def apply(v1: ^, v2: ^, optionsOrLoose: Boolean): Boolean = js.native
  def apply(v1: ^, v2: ^, optionsOrLoose: Options): Boolean = js.native
}
