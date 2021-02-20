package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subjectDirectoryAttributesMod {
  
  @JSImport("pkijs/src/SubjectDirectoryAttributes", JSImport.Default)
  @js.native
  class default () extends SubjectDirectoryAttributes {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/SubjectDirectoryAttributes", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/SubjectDirectoryAttributes", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/SubjectDirectoryAttributes", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait SubjectDirectoryAttributes extends StObject {
    
    var attributes: js.Array[typings.pkijs.attributeMod.default] = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object SubjectDirectoryAttributes {
    
    @scala.inline
    def apply(
      attributes: js.Array[typings.pkijs.attributeMod.default],
      fromSchema: js.Any => Unit,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): SubjectDirectoryAttributes = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[SubjectDirectoryAttributes]
    }
    
    @scala.inline
    implicit class SubjectDirectoryAttributesMutableBuilder[Self <: SubjectDirectoryAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Array[typings.pkijs.attributeMod.default]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesVarargs(value: typings.pkijs.attributeMod.default*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
