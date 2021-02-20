package typings.postcssSelectorParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait After extends StObject {
    
    var after: js.UndefOr[String] = js.native
    
    var attribute: js.UndefOr[PartialSpaceAround] = js.native
    
    var before: js.UndefOr[String] = js.native
    
    var insensitive: js.UndefOr[PartialSpaceAround] = js.native
    
    var operator: js.UndefOr[PartialSpaceAround] = js.native
    
    var value: js.UndefOr[PartialSpaceAround] = js.native
  }
  object After {
    
    @scala.inline
    def apply(): After = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[After]
    }
    
    @scala.inline
    implicit class AfterMutableBuilder[Self <: After] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setAttribute(value: PartialSpaceAround): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
      
      @scala.inline
      def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      @scala.inline
      def setInsensitive(value: PartialSpaceAround): Self = StObject.set(x, "insensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsensitiveUndefined: Self = StObject.set(x, "insensitive", js.undefined)
      
      @scala.inline
      def setOperator(value: PartialSpaceAround): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      @scala.inline
      def setValue(value: PartialSpaceAround): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Attribute extends StObject {
    
    var attribute: js.UndefOr[PartialSpaces] = js.native
    
    var insensitive: js.UndefOr[PartialSpaces] = js.native
    
    var operator: js.UndefOr[PartialSpaces] = js.native
    
    var value: js.UndefOr[PartialSpaces] = js.native
  }
  object Attribute {
    
    @scala.inline
    def apply(): Attribute = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attribute]
    }
    
    @scala.inline
    implicit class AttributeMutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttribute(value: PartialSpaces): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
      
      @scala.inline
      def setInsensitive(value: PartialSpaces): Self = StObject.set(x, "insensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsensitiveUndefined: Self = StObject.set(x, "insensitive", js.undefined)
      
      @scala.inline
      def setOperator(value: PartialSpaces): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      @scala.inline
      def setValue(value: PartialSpaces): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Before extends StObject {
    
    var after: String = js.native
    
    var attribute: js.UndefOr[PartialSpaces] = js.native
    
    var before: String = js.native
    
    var insensitive: js.UndefOr[PartialSpaces] = js.native
    
    var operator: js.UndefOr[PartialSpaces] = js.native
    
    var value: js.UndefOr[PartialSpaces] = js.native
  }
  object Before {
    
    @scala.inline
    def apply(after: String, before: String): Before = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[Before]
    }
    
    @scala.inline
    implicit class BeforeMutableBuilder[Self <: Before] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttribute(value: PartialSpaces): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
      
      @scala.inline
      def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsensitive(value: PartialSpaces): Self = StObject.set(x, "insensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsensitiveUndefined: Self = StObject.set(x, "insensitive", js.undefined)
      
      @scala.inline
      def setOperator(value: PartialSpaces): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      @scala.inline
      def setValue(value: PartialSpaces): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Column extends StObject {
    
    var column: Double = js.native
    
    var line: Double = js.native
  }
  object Column {
    
    @scala.inline
    def apply(column: Double, line: Double): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Insensitive extends StObject {
    
    var attribute: js.UndefOr[String] = js.native
    
    var insensitive: js.UndefOr[String] = js.native
    
    var operator: js.UndefOr[String] = js.native
    
    var spaces: js.UndefOr[Attribute] = js.native
    
    /** @deprecated The attribute value is unquoted, use that instead.. */
    var unquoted: js.UndefOr[String] = js.native
    
    /** The value of the attribute with quotes and escapes. */
    var value: js.UndefOr[String] = js.native
  }
  object Insensitive {
    
    @scala.inline
    def apply(): Insensitive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Insensitive]
    }
    
    @scala.inline
    implicit class InsensitiveMutableBuilder[Self <: Insensitive] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
      
      @scala.inline
      def setInsensitive(value: String): Self = StObject.set(x, "insensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsensitiveUndefined: Self = StObject.set(x, "insensitive", js.undefined)
      
      @scala.inline
      def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      @scala.inline
      def setSpaces(value: Attribute): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
      
      @scala.inline
      def setUnquoted(value: String): Self = StObject.set(x, "unquoted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnquotedUndefined: Self = StObject.set(x, "unquoted", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined std.Partial<postcss-selector-parser.postcss-selector-parser.Options> */
  @js.native
  trait PartialOptions extends StObject {
    
    var lossless: js.UndefOr[Boolean] = js.native
    
    var updateSelector: js.UndefOr[Boolean] = js.native
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLossless(value: Boolean): Self = StObject.set(x, "lossless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLosslessUndefined: Self = StObject.set(x, "lossless", js.undefined)
      
      @scala.inline
      def setUpdateSelector(value: Boolean): Self = StObject.set(x, "updateSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateSelectorUndefined: Self = StObject.set(x, "updateSelector", js.undefined)
    }
  }
  
  /* Inlined std.Partial<postcss-selector-parser.postcss-selector-parser.SpaceAround> */
  @js.native
  trait PartialSpaceAround extends StObject {
    
    var after: js.UndefOr[String] = js.native
    
    var before: js.UndefOr[String] = js.native
  }
  object PartialSpaceAround {
    
    @scala.inline
    def apply(): PartialSpaceAround = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSpaceAround]
    }
    
    @scala.inline
    implicit class PartialSpaceAroundMutableBuilder[Self <: PartialSpaceAround] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    }
  }
  
  /* Inlined std.Partial<postcss-selector-parser.postcss-selector-parser.Spaces> */
  @js.native
  trait PartialSpaces extends StObject {
    
    var after: js.UndefOr[String] = js.native
    
    var before: js.UndefOr[String] = js.native
  }
  object PartialSpaces {
    
    @scala.inline
    def apply(): PartialSpaces = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSpaces]
    }
    
    @scala.inline
    implicit class PartialSpacesMutableBuilder[Self <: PartialSpaces] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    }
  }
}
