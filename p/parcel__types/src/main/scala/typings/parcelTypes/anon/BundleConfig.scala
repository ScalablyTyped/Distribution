package typings.parcelTypes.anon

import typings.parcelSourceMap.mod.default
import typings.parcelTypes.mod.Async
import typings.parcelTypes.mod.NamedBundle
import typings.parcelTypes.mod.PluginLogger
import typings.parcelTypes.mod.PluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BundleConfig[ConfigType, BundleConfigType] extends StObject {
  
  var bundle: NamedBundle = js.native
  
  var bundleConfig: BundleConfigType = js.native
  
  var bundleGraph: typings.parcelTypes.mod.BundleGraph[NamedBundle] = js.native
  
  var config: ConfigType = js.native
  
  def getInlineBundleContents(arg0: typings.parcelTypes.mod.Bundle, arg1: typings.parcelTypes.mod.BundleGraph[NamedBundle]): Async[Contents] = js.native
  
  def getSourceMapReference(): Async[js.UndefOr[String | Null]] = js.native
  def getSourceMapReference(map: default): Async[js.UndefOr[String | Null]] = js.native
  
  var logger: PluginLogger = js.native
  
  var options: PluginOptions = js.native
}
