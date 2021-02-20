package typings.nodelibFsWalk

import typings.nodelibFsWalk.settingsMod.FilterFunction
import typings.nodelibFsWalk.settingsMod.default
import typings.nodelibFsWalk.typesMod.Errno
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("@nodelib/fs.walk/out/readers/common", "isAppliedFilter")
  @js.native
  def isAppliedFilter[T](filter: Null, value: T): Boolean = js.native
  @JSImport("@nodelib/fs.walk/out/readers/common", "isAppliedFilter")
  @js.native
  def isAppliedFilter[T](filter: FilterFunction[T], value: T): Boolean = js.native
  
  @JSImport("@nodelib/fs.walk/out/readers/common", "isFatalError")
  @js.native
  def isFatalError(settings: default, error: Errno): Boolean = js.native
  
  @JSImport("@nodelib/fs.walk/out/readers/common", "joinPathSegments")
  @js.native
  def joinPathSegments(a: String, b: String, separator: String): String = js.native
  
  @JSImport("@nodelib/fs.walk/out/readers/common", "replacePathSegmentSeparator")
  @js.native
  def replacePathSegmentSeparator(filepath: String, separator: String): String = js.native
}
