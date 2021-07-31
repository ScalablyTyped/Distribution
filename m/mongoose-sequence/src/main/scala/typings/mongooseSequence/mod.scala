package typings.mongooseSequence

import typings.std.AddEventListenerOptions
import typings.std.Document
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait SequenceDocument
    extends StObject
       with Document {
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    
    def setNext(sequenceId: String, callback: js.Function2[/* err */ js.Any, /* res */ this.type, Unit]): Unit = js.native
  }
  
  trait SequenceOptions extends StObject {
    
    // If true, the counter will not be incremented on saving a new document. Default to false
    var collection_name: js.UndefOr[String] = js.undefined
    
    // The field to reference for a scoped counter. Optional
    var disable_hooks: js.UndefOr[Boolean] = js.undefined
    
    // The name of the field to increment. Mandatory, default is _id
    var id: js.UndefOr[String] = js.undefined
    
    var inc_field: String
    
    // Id of the sequence. Is mandatory only for scoped sequences but its use is strongly encouraged.
    var reference_fields: js.UndefOr[js.Array[String]] = js.undefined
  }
  object SequenceOptions {
    
    @scala.inline
    def apply(inc_field: String): SequenceOptions = {
      val __obj = js.Dynamic.literal(inc_field = inc_field.asInstanceOf[js.Any])
      __obj.asInstanceOf[SequenceOptions]
    }
    
    @scala.inline
    implicit class SequenceOptionsMutableBuilder[Self <: SequenceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollection_name(value: String): Self = StObject.set(x, "collection_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollection_nameUndefined: Self = StObject.set(x, "collection_name", js.undefined)
      
      @scala.inline
      def setDisable_hooks(value: Boolean): Self = StObject.set(x, "disable_hooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisable_hooksUndefined: Self = StObject.set(x, "disable_hooks", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInc_field(value: String): Self = StObject.set(x, "inc_field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReference_fields(value: js.Array[String]): Self = StObject.set(x, "reference_fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReference_fieldsUndefined: Self = StObject.set(x, "reference_fields", js.undefined)
      
      @scala.inline
      def setReference_fieldsVarargs(value: String*): Self = StObject.set(x, "reference_fields", js.Array(value :_*))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Schema * / any */ @js.native
  trait SequenceSchema extends StObject {
    
    // overload for the default mongoose plugin function
    def plugin(
      plugin: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Schema */ /* schema */ js.Any, 
          /* options */ js.UndefOr[js.Object], 
          Unit
        ]
    ): this.type = js.native
    def plugin(
      plugin: js.Function2[/* schema */ this.type, /* options */ SequenceOptions, Unit],
      options: SequenceOptions
    ): this.type = js.native
    def plugin(
      plugin: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Schema */ /* schema */ js.Any, 
          /* options */ js.UndefOr[js.Object], 
          Unit
        ],
      opts: js.Object
    ): this.type = js.native
  }
}
