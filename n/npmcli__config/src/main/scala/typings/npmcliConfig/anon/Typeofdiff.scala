package typings.npmcliConfig.anon

import typings.semver.classesSemverMod.^
import typings.semver.mod.ReleaseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofdiff extends StObject {
  
  /**
    * Returns difference between two versions by the release type (major, premajor, minor, preminor, patch, prepatch, or prerelease), or null if the versions are the same.
    */
  def apply(v1: String, v2: String): ReleaseType | Null = js.native
  def apply(v1: String, v2: ^): ReleaseType | Null = js.native
  def apply(v1: ^, v2: String): ReleaseType | Null = js.native
  def apply(v1: ^, v2: ^): ReleaseType | Null = js.native
}
