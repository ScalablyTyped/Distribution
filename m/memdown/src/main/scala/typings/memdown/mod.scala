package typings.memdown

import org.scalablytyped.runtime.Instantiable1
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("memdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("memdown", JSImport.Default)
  @js.native
  val default: MemDownConstructor = js.native
  
  @scala.inline
  def clearGlobalStore(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clearGlobalStore")().asInstanceOf[js.Any]
  @scala.inline
  def clearGlobalStore(strict: Boolean): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clearGlobalStore")(strict.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("memdown", JSImport.Default)
  @js.native
  class defaultCls[K, V] protected ()
    extends StObject
       with AbstractLevelDOWN[K, V] {
    def this(location: String) = this()
  }
  
  @scala.inline
  def destroy(location: String, cb: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(location.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type MemDown[K, V] = AbstractLevelDOWN[K, V]
  
  @js.native
  trait MemDownConstructor
    extends StObject
       with Instantiable1[/* location */ String, MemDown[js.Object, js.Object]] {
    
    def apply[K, V](location: String): MemDown[K, V] = js.native
  }
  
  trait MemDownGetOptions extends StObject {
    
    var asBuffer: js.UndefOr[Boolean] = js.undefined
  }
  object MemDownGetOptions {
    
    @scala.inline
    def apply(): MemDownGetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemDownGetOptions]
    }
    
    @scala.inline
    implicit class MemDownGetOptionsMutableBuilder[Self <: MemDownGetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsBuffer(value: Boolean): Self = StObject.set(x, "asBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsBufferUndefined: Self = StObject.set(x, "asBuffer", js.undefined)
    }
  }
  
  trait MemDownIteratorOptions extends StObject {
    
    var keyAsBuffer: js.UndefOr[Boolean] = js.undefined
    
    var valueAsBuffer: js.UndefOr[Boolean] = js.undefined
  }
  object MemDownIteratorOptions {
    
    @scala.inline
    def apply(): MemDownIteratorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemDownIteratorOptions]
    }
    
    @scala.inline
    implicit class MemDownIteratorOptionsMutableBuilder[Self <: MemDownIteratorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyAsBuffer(value: Boolean): Self = StObject.set(x, "keyAsBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyAsBufferUndefined: Self = StObject.set(x, "keyAsBuffer", js.undefined)
      
      @scala.inline
      def setValueAsBuffer(value: Boolean): Self = StObject.set(x, "valueAsBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueAsBufferUndefined: Self = StObject.set(x, "valueAsBuffer", js.undefined)
    }
  }
}
