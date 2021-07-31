package typings.nodelibFsWalk

import typings.nodelibFsWalk.settingsMod.FilterFunction
import typings.nodelibFsWalk.settingsMod.default
import typings.nodelibFsWalk.typesMod.Errno
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("@nodelib/fs.walk/out/readers/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isAppliedFilter[T](filter: Null, value: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAppliedFilter")(filter.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isAppliedFilter[T](filter: FilterFunction[T], value: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAppliedFilter")(filter.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isFatalError(settings: default, error: Errno): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFatalError")(settings.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def joinPathSegments(a: String, b: String, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("joinPathSegments")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def replacePathSegmentSeparator(filepath: String, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replacePathSegmentSeparator")(filepath.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
}
