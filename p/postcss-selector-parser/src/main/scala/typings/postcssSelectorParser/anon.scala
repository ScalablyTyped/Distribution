package typings.postcssSelectorParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait After extends StObject {
    
    var after: js.UndefOr[String] = js.undefined
    
    var before: js.UndefOr[String] = js.undefined
  }
  object After {
    
    inline def apply(): After = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[After]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: After] (val x: Self) extends AnyVal {
      
      inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    }
  }
  
  trait Attribute extends StObject {
    
    var after: js.UndefOr[String] = js.undefined
    
    var attribute: js.UndefOr[PartialSpaceAround] = js.undefined
    
    var before: js.UndefOr[String] = js.undefined
    
    var insensitive: js.UndefOr[PartialSpaceAround] = js.undefined
    
    var operator: js.UndefOr[PartialSpaceAround] = js.undefined
    
    var value: js.UndefOr[PartialSpaceAround] = js.undefined
  }
  object Attribute {
    
    inline def apply(): Attribute = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attribute]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
      
      inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setAttribute(value: PartialSpaceAround): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setInsensitive(value: PartialSpaceAround): Self = StObject.set(x, "insensitive", value.asInstanceOf[js.Any])
      
      inline def setInsensitiveUndefined: Self = StObject.set(x, "insensitive", js.undefined)
      
      inline def setOperator(value: PartialSpaceAround): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      inline def setValue(value: PartialSpaceAround): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Before extends StObject {
    
    var after: String
    
    var attribute: js.UndefOr[PartialSpaces] = js.undefined
    
    var before: String
    
    var insensitive: js.UndefOr[PartialSpaces] = js.undefined
    
    var operator: js.UndefOr[PartialSpaces] = js.undefined
    
    var value: js.UndefOr[PartialSpaces] = js.undefined
  }
  object Before {
    
    inline def apply(after: String, before: String): Before = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[Before]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Before] (val x: Self) extends AnyVal {
      
      inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAttribute(value: PartialSpaces): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setInsensitive(value: PartialSpaces): Self = StObject.set(x, "insensitive", value.asInstanceOf[js.Any])
      
      inline def setInsensitiveUndefined: Self = StObject.set(x, "insensitive", js.undefined)
      
      inline def setOperator(value: PartialSpaces): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      inline def setValue(value: PartialSpaces): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Column extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object Column {
    
    inline def apply(column: Double, line: Double): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait Insensitive extends StObject {
    
    var attribute: js.UndefOr[PartialSpaces] = js.undefined
    
    var insensitive: js.UndefOr[PartialSpaces] = js.undefined
    
    var operator: js.UndefOr[PartialSpaces] = js.undefined
    
    var value: js.UndefOr[PartialSpaces] = js.undefined
  }
  object Insensitive {
    
    inline def apply(): Insensitive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Insensitive]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Insensitive] (val x: Self) extends AnyVal {
      
      inline def setAttribute(value: PartialSpaces): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
      
      inline def setInsensitive(value: PartialSpaces): Self = StObject.set(x, "insensitive", value.asInstanceOf[js.Any])
      
      inline def setInsensitiveUndefined: Self = StObject.set(x, "insensitive", js.undefined)
      
      inline def setOperator(value: PartialSpaces): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      inline def setValue(value: PartialSpaces): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Operator extends StObject {
    
    var attribute: js.UndefOr[String] = js.undefined
    
    var insensitive: js.UndefOr[String] = js.undefined
    
    var operator: js.UndefOr[String] = js.undefined
    
    var spaces: js.UndefOr[Insensitive] = js.undefined
    
    /** @deprecated The attribute value is unquoted, use that instead.. */
    var unquoted: js.UndefOr[String] = js.undefined
    
    /** The value of the attribute with quotes and escapes. */
    var value: js.UndefOr[String] = js.undefined
  }
  object Operator {
    
    inline def apply(): Operator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Operator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Operator] (val x: Self) extends AnyVal {
      
      inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
      
      inline def setInsensitive(value: String): Self = StObject.set(x, "insensitive", value.asInstanceOf[js.Any])
      
      inline def setInsensitiveUndefined: Self = StObject.set(x, "insensitive", js.undefined)
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      inline def setSpaces(value: Insensitive): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
      
      inline def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
      
      inline def setUnquoted(value: String): Self = StObject.set(x, "unquoted", value.asInstanceOf[js.Any])
      
      inline def setUnquotedUndefined: Self = StObject.set(x, "unquoted", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined std.Partial<postcss-selector-parser.postcss-selector-parser.Options> */
  trait PartialOptions extends StObject {
    
    var lossless: js.UndefOr[Boolean] = js.undefined
    
    var updateSelector: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      inline def setLossless(value: Boolean): Self = StObject.set(x, "lossless", value.asInstanceOf[js.Any])
      
      inline def setLosslessUndefined: Self = StObject.set(x, "lossless", js.undefined)
      
      inline def setUpdateSelector(value: Boolean): Self = StObject.set(x, "updateSelector", value.asInstanceOf[js.Any])
      
      inline def setUpdateSelectorUndefined: Self = StObject.set(x, "updateSelector", js.undefined)
    }
  }
  
  /* Inlined std.Partial<postcss-selector-parser.postcss-selector-parser.SpaceAround> */
  trait PartialSpaceAround extends StObject {
    
    var after: js.UndefOr[String] = js.undefined
    
    var before: js.UndefOr[String] = js.undefined
  }
  object PartialSpaceAround {
    
    inline def apply(): PartialSpaceAround = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSpaceAround]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialSpaceAround] (val x: Self) extends AnyVal {
      
      inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    }
  }
  
  /* Inlined std.Partial<postcss-selector-parser.postcss-selector-parser.Spaces> */
  trait PartialSpaces extends StObject {
    
    var after: js.UndefOr[String] = js.undefined
    
    var before: js.UndefOr[String] = js.undefined
  }
  object PartialSpaces {
    
    inline def apply(): PartialSpaces = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSpaces]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialSpaces] (val x: Self) extends AnyVal {
      
      inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    }
  }
}
