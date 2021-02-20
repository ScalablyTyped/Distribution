package typings.pdfmake

import typings.pdfmake.interfacesMod.OrderedListType
import typings.pdfmake.interfacesMod.PageOrientation
import typings.pdfmake.interfacesMod.Size
import typings.pdfmake.interfacesMod.UnorderedListType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Border extends StObject {
    
    var border: js.UndefOr[js.Tuple4[Boolean, Boolean, Boolean, Boolean]] = js.native
    
    var borderColor: js.UndefOr[js.Tuple4[String, String, String, String]] = js.native
    
    var colSpan: js.UndefOr[Double] = js.native
    
    var fillOpacity: js.UndefOr[Double] = js.native
    
    var rowSpan: js.UndefOr[Double] = js.native
  }
  object Border {
    
    @scala.inline
    def apply(): Border = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Border]
    }
    
    @scala.inline
    implicit class BorderMutableBuilder[Self <: Border] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: js.Tuple4[Boolean, Boolean, Boolean, Boolean]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColor(value: js.Tuple4[String, String, String, String]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
    }
  }
  
  @js.native
  trait Counter extends StObject {
    
    var counter: js.UndefOr[Double] = js.native
    
    var listType: js.UndefOr[OrderedListType] = js.native
  }
  object Counter {
    
    @scala.inline
    def apply(): Counter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Counter]
    }
    
    @scala.inline
    implicit class CounterMutableBuilder[Self <: Counter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
      
      @scala.inline
      def setListType(value: OrderedListType): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListTypeUndefined: Self = StObject.set(x, "listType", js.undefined)
    }
  }
  
  @js.native
  trait HorizontalRatio extends StObject {
    
    var horizontalRatio: Double = js.native
    
    var left: Double = js.native
    
    var pageInnerHeight: Double = js.native
    
    var pageInnerWidth: Double = js.native
    
    var pageNumber: Double = js.native
    
    var pageOrientation: PageOrientation = js.native
    
    var top: Double = js.native
    
    var verticalRatio: Double = js.native
  }
  object HorizontalRatio {
    
    @scala.inline
    def apply(
      horizontalRatio: Double,
      left: Double,
      pageInnerHeight: Double,
      pageInnerWidth: Double,
      pageNumber: Double,
      pageOrientation: PageOrientation,
      top: Double,
      verticalRatio: Double
    ): HorizontalRatio = {
      val __obj = js.Dynamic.literal(horizontalRatio = horizontalRatio.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], pageInnerHeight = pageInnerHeight.asInstanceOf[js.Any], pageInnerWidth = pageInnerWidth.asInstanceOf[js.Any], pageNumber = pageNumber.asInstanceOf[js.Any], pageOrientation = pageOrientation.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], verticalRatio = verticalRatio.asInstanceOf[js.Any])
      __obj.asInstanceOf[HorizontalRatio]
    }
    
    @scala.inline
    implicit class HorizontalRatioMutableBuilder[Self <: HorizontalRatio] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHorizontalRatio(value: Double): Self = StObject.set(x, "horizontalRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageInnerHeight(value: Double): Self = StObject.set(x, "pageInnerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageInnerWidth(value: Double): Self = StObject.set(x, "pageInnerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalRatio(value: Double): Self = StObject.set(x, "verticalRatio", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Length extends StObject {
    
    var length: Double = js.native
    
    var space: js.UndefOr[Double] = js.native
  }
  object Length {
    
    @scala.inline
    def apply(length: Double): Length = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length]
    }
    
    @scala.inline
    implicit class LengthMutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
  
  @js.native
  trait ListType extends StObject {
    
    var listType: js.UndefOr[UnorderedListType] = js.native
  }
  object ListType {
    
    @scala.inline
    def apply(): ListType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListType]
    }
    
    @scala.inline
    implicit class ListTypeMutableBuilder[Self <: ListType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setListType(value: UnorderedListType): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListTypeUndefined: Self = StObject.set(x, "listType", js.undefined)
    }
  }
  
  @js.native
  trait Width extends StObject {
    
    var width: js.UndefOr[Size] = js.native
  }
  object Width {
    
    @scala.inline
    def apply(): Width = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Width]
    }
    
    @scala.inline
    implicit class WidthMutableBuilder[Self <: Width] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWidth(value: Size): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait X extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
