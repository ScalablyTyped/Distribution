package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISharedLinkInfos extends StObject {
  
  def Add(Index: Double, SharedLink: ISharedLinkInfo): Unit = js.native
  
  def Clone(): ISharedLinkInfos = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): ISharedLinkInfo = js.native
  def Item(Index: Double, value: ISharedLinkInfo): Unit = js.native
  
  def Remove(Index: Double): Unit = js.native
}
