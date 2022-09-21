package typings.openrct2.mod.global

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Configuration extends StObject {
  
  def get[T](key: String): js.UndefOr[T] = js.native
  def get[T](key: String, defaultValue: T): T = js.native
  
  def getAll(namespace: String): StringDictionary[Any] = js.native
  
  def has(key: String): Boolean = js.native
  
  def set[T](key: String, value: T): Unit = js.native
}
