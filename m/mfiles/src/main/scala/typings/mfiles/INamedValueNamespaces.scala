package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INamedValueNamespaces extends StObject {
  
  def Add(Index: Double, NamedValueNamespace: INamedValueNamespace): Unit = js.native
  
  def Clone(): INamedValueNamespaces = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): INamedValueNamespace = js.native
  def Item(Index: Double, value: INamedValueNamespace): Unit = js.native
  
  def Remove(Index: Double): Unit = js.native
}
