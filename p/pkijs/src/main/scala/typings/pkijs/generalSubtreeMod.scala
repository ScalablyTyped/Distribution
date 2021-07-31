package typings.pkijs

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generalSubtreeMod {
  
  @JSImport("pkijs/src/GeneralSubtree", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with GeneralSubtree {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    var base: typings.pkijs.generalNameMod.default = js.native
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var minimum: Double | Integer = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/GeneralSubtree", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    @scala.inline
    def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait GeneralSubtree extends StObject {
    
    var base: typings.pkijs.generalNameMod.default
    
    def fromSchema(schema: js.Any): Unit
    
    var maximum: js.UndefOr[Double | Integer] = js.undefined
    
    var minimum: Double | Integer
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object GeneralSubtree {
    
    @scala.inline
    def apply(
      base: typings.pkijs.generalNameMod.default,
      fromSchema: js.Any => Unit,
      minimum: Double | Integer,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): GeneralSubtree = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), minimum = minimum.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[GeneralSubtree]
    }
    
    @scala.inline
    implicit class GeneralSubtreeMutableBuilder[Self <: GeneralSubtree] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: typings.pkijs.generalNameMod.default): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaximum(value: Double | Integer): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      @scala.inline
      def setMinimum(value: Double | Integer): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
