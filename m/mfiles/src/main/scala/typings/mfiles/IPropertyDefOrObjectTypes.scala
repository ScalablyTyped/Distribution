package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropertyDefOrObjectTypes extends StObject {
  
  def Add(Index: Double, PropertyDefOrObjectType: IPropertyDefOrObjectType): Unit = js.native
  
  def Clone(): IPropertyDefOrObjectTypes = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IPropertyDefOrObjectType = js.native
  def Item(Index: Double, value: IPropertyDefOrObjectType): Unit = js.native
  
  def Remove(Index: Double): Unit = js.native
}
