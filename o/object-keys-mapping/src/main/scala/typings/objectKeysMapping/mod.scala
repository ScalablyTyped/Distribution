package typings.objectKeysMapping

import typings.objectKeysMapping.anon.Camelcase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("object-keys-mapping", "Operator")
  @js.native
  class Operator () extends StObject {
    def this(opts: Camelcase) = this()
    
    def map(origin: js.Array[js.Object]): js.Array[js.Object] = js.native
    def map(origin: js.Object): js.Object = js.native
    
    def mapArray(origin: js.Array[js.Object]): js.Array[js.Object] = js.native
    
    def mapField(path: String): String = js.native
    
    def mapObject(origin: js.Object, path: String): js.Object = js.native
  }
  
  @JSImport("object-keys-mapping", "reverseCamelcase")
  @js.native
  def reverseCamelcase(origin: js.Array[js.Object]): js.Array[js.Object] = js.native
  @JSImport("object-keys-mapping", "reverseCamelcase")
  @js.native
  def reverseCamelcase(origin: js.Object): js.Object = js.native
  
  @JSImport("object-keys-mapping", "toCamelcase")
  @js.native
  def toCamelcase(origin: js.Array[js.Object]): js.Array[js.Object] = js.native
  @JSImport("object-keys-mapping", "toCamelcase")
  @js.native
  def toCamelcase(origin: js.Object): js.Object = js.native
  
  @JSImport("object-keys-mapping", "trim")
  @js.native
  def trim(origin: js.Array[js.Object]): js.Array[js.Object] = js.native
  @JSImport("object-keys-mapping", "trim")
  @js.native
  def trim(origin: js.Array[js.Object], ignore: js.Function1[/* v */ js.Any, Boolean]): js.Array[js.Object] = js.native
  @JSImport("object-keys-mapping", "trim")
  @js.native
  def trim(origin: js.Object): js.Object = js.native
  @JSImport("object-keys-mapping", "trim")
  @js.native
  def trim(origin: js.Object, ignore: js.Function1[/* v */ js.Any, Boolean]): js.Object = js.native
  
  @js.native
  trait OperatorOptions extends StObject {
    
    var camelcase: js.UndefOr[Boolean] = js.native
    
    var mapping: js.UndefOr[js.Object] = js.native
  }
  object OperatorOptions {
    
    @scala.inline
    def apply(): OperatorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OperatorOptions]
    }
    
    @scala.inline
    implicit class OperatorOptionsMutableBuilder[Self <: OperatorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCamelcase(value: Boolean): Self = StObject.set(x, "camelcase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCamelcaseUndefined: Self = StObject.set(x, "camelcase", js.undefined)
      
      @scala.inline
      def setMapping(value: js.Object): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    }
  }
}
