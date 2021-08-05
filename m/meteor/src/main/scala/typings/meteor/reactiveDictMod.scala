package typings.meteor

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactiveDictMod {
  
  @JSImport("meteor/reactive-dict", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait ReactiveDict extends StObject {
    
    def all(): EJSONable = js.native
    
    def clear(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def equals(key: String): Boolean = js.native
    def equals(key: String, value: String): Boolean = js.native
    def equals(key: String, value: Boolean): Boolean = js.native
    def equals(key: String, value: Double): Boolean = js.native
    
    def get(key: String): EJSONableProperty = js.native
    
    def set(key: String): Unit = js.native
    def set(key: String, value: EJSONableProperty): Unit = js.native
    def set(`object`: EJSONable): Unit = js.native
    
    def setDefault(key: String): Unit = js.native
    def setDefault(key: String, value: EJSONableProperty): Unit = js.native
    def setDefault(`object`: EJSONable): Unit = js.native
  }
  @JSImport("meteor/reactive-dict", "ReactiveDict")
  @js.native
  def ReactiveDict: typings.meteor.reactiveDictMod.ReactiveDictStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("meteor/reactive-dict", "ReactiveDict")
  @js.native
  class ReactiveDictCls ()
    extends StObject
       with typings.meteor.reactiveDictMod.ReactiveDict {
    def this(name: String) = this()
    def this(name: String, initialValue: EJSONable) = this()
    def this(name: Unit, initialValue: EJSONable) = this()
  }
  
  inline def ReactiveDict_=(x: typings.meteor.reactiveDictMod.ReactiveDictStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReactiveDict")(x.asInstanceOf[js.Any])
  
  @js.native
  trait ReactiveDictStatic
    extends StObject
       with Instantiable0[typings.meteor.reactiveDictMod.ReactiveDict]
       with Instantiable1[/* name */ String, typings.meteor.reactiveDictMod.ReactiveDict]
       with Instantiable2[
          (/* name */ String) | (/* name */ Unit), 
          /* initialValue */ EJSONable, 
          typings.meteor.reactiveDictMod.ReactiveDict
        ]
}
