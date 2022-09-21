package typings.pixiLoaders.mod

import typings.pixiLoaders.mod.LoaderResource.OnCompleteSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILoaderAdd extends StObject {
  
  def apply(name: String, url: String): Loader = js.native
  def apply(name: String, url: String, callback: OnCompleteSignal): Loader = js.native
  def apply(name: String, url: String, options: Unit, callback: OnCompleteSignal): Loader = js.native
  def apply(name: String, url: String, options: IAddOptions): Loader = js.native
  def apply(name: String, url: String, options: IAddOptions, callback: OnCompleteSignal): Loader = js.native
  def apply(options: IAddOptions): Loader = js.native
  def apply(options: IAddOptions, callback: OnCompleteSignal): Loader = js.native
  def apply(resources: js.Array[IAddOptions | String]): Loader = js.native
  def apply(resources: js.Array[IAddOptions | String], callback: OnCompleteSignal): Loader = js.native
  def apply(url: String): Loader = js.native
  def apply(url: String, callback: OnCompleteSignal): Loader = js.native
  def apply(url: String, options: Unit, callback: OnCompleteSignal): Loader = js.native
  def apply(url: String, options: IAddOptions): Loader = js.native
  def apply(url: String, options: IAddOptions, callback: OnCompleteSignal): Loader = js.native
}
