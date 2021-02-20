package typings.pouchdbMapreduce

import typings.pouchdbCore.PouchDB.Core.AllDocsMeta
import typings.pouchdbCore.PouchDB.Core.ExistingDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Doc[Content /* <: js.Object */] extends StObject {
    
    var doc: js.UndefOr[ExistingDocument[Content with AllDocsMeta]] = js.native
    
    var id: js.Any = js.native
    
    var key: js.Any = js.native
    
    var value: js.Any = js.native
  }
  object Doc {
    
    @scala.inline
    def apply[Content /* <: js.Object */](id: js.Any, key: js.Any, value: js.Any): Doc[Content] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Doc[Content]]
    }
    
    @scala.inline
    implicit class DocMutableBuilder[Self <: Doc[_], Content /* <: js.Object */] (val x: Self with Doc[Content]) extends AnyVal {
      
      @scala.inline
      def setDoc(value: ExistingDocument[Content with AllDocsMeta]): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
      
      @scala.inline
      def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
