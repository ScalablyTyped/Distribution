package typings.pdfmake

import typings.pdfmake.interfacesMod.OrderedListType
import typings.pdfmake.interfacesMod.PageOrientation
import typings.pdfmake.interfacesMod.Size
import typings.pdfmake.interfacesMod.UnorderedListType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Border extends StObject {
    
    var border: js.UndefOr[js.Tuple4[Boolean, Boolean, Boolean, Boolean]] = js.undefined
    
    var borderColor: js.UndefOr[js.Tuple4[String, String, String, String]] = js.undefined
    
    var colSpan: js.UndefOr[Double] = js.undefined
    
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    var rowSpan: js.UndefOr[Double] = js.undefined
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
  
  trait Counter extends StObject {
    
    var counter: js.UndefOr[Double] = js.undefined
    
    var listType: js.UndefOr[OrderedListType] = js.undefined
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
  
  trait HorizontalRatio extends StObject {
    
    var horizontalRatio: Double
    
    var left: Double
    
    var pageInnerHeight: Double
    
    var pageInnerWidth: Double
    
    var pageNumber: Double
    
    var pageOrientation: PageOrientation
    
    var top: Double
    
    var verticalRatio: Double
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
  
  trait Length extends StObject {
    
    var length: Double
    
    var space: js.UndefOr[Double] = js.undefined
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
  
  trait ListType extends StObject {
    
    var listType: js.UndefOr[UnorderedListType] = js.undefined
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
  
  trait Width extends StObject {
    
    var width: js.UndefOr[Size] = js.undefined
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
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
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
