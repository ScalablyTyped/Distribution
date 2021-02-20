package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjectVersions extends StObject {
  
  def Add(Index: Double, ObjectVersionData: IObjectVersion): Unit = js.native
  
  val Count: Double = js.native
  
  def GetAsObjVers(): IObjVers = js.native
  
  def Item(Index: Double): IObjectVersion = js.native
  def Item(Index: Double, value: IObjectVersion): Unit = js.native
  
  def Remove(Index: Double): Unit = js.native
  
  def Sort(ObjectComparer: IObjectComparer): Unit = js.native
}
