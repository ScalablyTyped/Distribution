package typings.npmcliArborist.mod

import typings.npmcliArborist.npmcliArboristBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@npmcli/arborist", "Shrinkwrap")
@js.native
open class Shrinkwrap () extends StObject {
  
  def commit(): PackageLock = js.native
  
  var filename: String | Null = js.native
  
  var loadedFromDisk: Boolean = js.native
  
  var path: String = js.native
  
  var resolveOptions: typings.pacote.mod.Options = js.native
  
  def save(): js.Promise[js.Tuple2[Unit, js.UndefOr[`false`]]] = js.native
  def save(options: ToStringOptions): js.Promise[js.Tuple2[Unit, js.UndefOr[`false`]]] = js.native
  
  def toJSON(): PackageLock = js.native
  
  def toString(options: ToStringOptions): String = js.native
  
  var `type`: String | Null = js.native
}
