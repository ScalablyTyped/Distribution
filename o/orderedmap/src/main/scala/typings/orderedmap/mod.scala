package typings.orderedmap

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("orderedmap", JSImport.Namespace)
  @js.native
  class ^[T] ()
    extends StObject
       with OrderedMap[T]
  @JSImport("orderedmap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def from[T](): OrderedMap[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[OrderedMap[T]]
  @scala.inline
  def from[T](value: StringDictionary[T]): OrderedMap[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[OrderedMap[T]]
  @scala.inline
  def from[T](value: OrderedMap[T]): OrderedMap[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[OrderedMap[T]]
  
  @js.native
  trait OrderedMap[T] extends StObject {
    
    def addBefore(place: String, key: String, value: T): this.type = js.native
    
    def addToEnd(key: String, value: T): this.type = js.native
    
    def addToStart(key: String, value: T): this.type = js.native
    
    def append(map: StringDictionary[T]): this.type = js.native
    def append(map: OrderedMap[T]): this.type = js.native
    
    def forEach(f: js.Function2[/* key */ String, /* value */ T, Unit]): Unit = js.native
    
    def get(key: String): js.UndefOr[T] = js.native
    
    def prepend(map: StringDictionary[T]): this.type = js.native
    def prepend(map: OrderedMap[T]): this.type = js.native
    
    def remove(key: String): this.type = js.native
    
    val size: Double = js.native
    
    def subtract(map: StringDictionary[T]): this.type = js.native
    def subtract(map: OrderedMap[T]): this.type = js.native
    
    def update(key: String, value: T): this.type = js.native
    def update(key: String, value: T, newKey: String): this.type = js.native
  }
}
