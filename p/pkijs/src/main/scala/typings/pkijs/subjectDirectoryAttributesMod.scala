package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subjectDirectoryAttributesMod {
  
  @JSImport("pkijs/src/SubjectDirectoryAttributes", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with SubjectDirectoryAttributes {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    var attributes: js.Array[typings.pkijs.attributeMod.default] = js.native
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/SubjectDirectoryAttributes", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    inline def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait SubjectDirectoryAttributes extends StObject {
    
    var attributes: js.Array[typings.pkijs.attributeMod.default]
    
    def fromSchema(schema: js.Any): Unit
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object SubjectDirectoryAttributes {
    
    inline def apply(
      attributes: js.Array[typings.pkijs.attributeMod.default],
      fromSchema: js.Any => Unit,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): SubjectDirectoryAttributes = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[SubjectDirectoryAttributes]
    }
    
    extension [Self <: SubjectDirectoryAttributes](x: Self) {
      
      inline def setAttributes(value: js.Array[typings.pkijs.attributeMod.default]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesVarargs(value: typings.pkijs.attributeMod.default*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      inline def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
