package typings.officeUiFabricReact

import typings.officeUiFabricReact.calendarTypesMod.ICalendarIconStrings
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarYearMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Calendar/CalendarYear", "CalendarYear")
  @js.native
  class CalendarYear protected ()
    extends Component[ICalendarYearProps, ICalendarYearState, js.Any]
       with ICalendarYear {
    def this(props: ICalendarYearProps) = this()
    
    var _calculateInitialStateFromProps: js.Any = js.native
    
    var _gridRef: js.Any = js.native
    
    var _onNavNext: js.Any = js.native
    
    var _onNavPrev: js.Any = js.native
    
    var _renderGrid: js.Any = js.native
    
    var _renderHeader: js.Any = js.native
    
    /* CompleteClass */
    override def focus(): Unit = js.native
  }
  
  trait ICalendarYear extends StObject {
    
    def focus(): Unit
  }
  object ICalendarYear {
    
    @scala.inline
    def apply(focus: () => Unit): ICalendarYear = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[ICalendarYear]
    }
    
    @scala.inline
    implicit class ICalendarYearMutableBuilder[Self <: ICalendarYear] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  trait ICalendarYearHeaderProps
    extends StObject
       with ICalendarYearProps
       with ICalendarYearRange {
    
    var onSelectNext: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSelectPrev: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ICalendarYearHeaderProps {
    
    @scala.inline
    def apply(fromYear: Double, toYear: Double): ICalendarYearHeaderProps = {
      val __obj = js.Dynamic.literal(fromYear = fromYear.asInstanceOf[js.Any], toYear = toYear.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICalendarYearHeaderProps]
    }
    
    @scala.inline
    implicit class ICalendarYearHeaderPropsMutableBuilder[Self <: ICalendarYearHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnSelectNext(value: () => Unit): Self = StObject.set(x, "onSelectNext", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSelectNextUndefined: Self = StObject.set(x, "onSelectNext", js.undefined)
      
      @scala.inline
      def setOnSelectPrev(value: () => Unit): Self = StObject.set(x, "onSelectPrev", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSelectPrevUndefined: Self = StObject.set(x, "onSelectPrev", js.undefined)
    }
  }
  
  trait ICalendarYearProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var maxYear: js.UndefOr[Double] = js.undefined
    
    var minYear: js.UndefOr[Double] = js.undefined
    
    var navigatedYear: js.UndefOr[Double] = js.undefined
    
    var navigationIcons: js.UndefOr[ICalendarIconStrings] = js.undefined
    
    var onHeaderSelect: js.UndefOr[js.Function1[/* focus */ Boolean, Unit]] = js.undefined
    
    var onRenderTitle: js.UndefOr[js.Function1[/* props */ ICalendarYearHeaderProps, ReactNode]] = js.undefined
    
    var onRenderYear: js.UndefOr[js.Function1[/* year */ Double, ReactNode]] = js.undefined
    
    var onSelectYear: js.UndefOr[js.Function1[/* year */ Double, Unit]] = js.undefined
    
    var selectedYear: js.UndefOr[Double] = js.undefined
    
    var strings: js.UndefOr[ICalendarYearStrings] = js.undefined
  }
  object ICalendarYearProps {
    
    @scala.inline
    def apply(): ICalendarYearProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICalendarYearProps]
    }
    
    @scala.inline
    implicit class ICalendarYearPropsMutableBuilder[Self <: ICalendarYearProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setMaxYear(value: Double): Self = StObject.set(x, "maxYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxYearUndefined: Self = StObject.set(x, "maxYear", js.undefined)
      
      @scala.inline
      def setMinYear(value: Double): Self = StObject.set(x, "minYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinYearUndefined: Self = StObject.set(x, "minYear", js.undefined)
      
      @scala.inline
      def setNavigatedYear(value: Double): Self = StObject.set(x, "navigatedYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigatedYearUndefined: Self = StObject.set(x, "navigatedYear", js.undefined)
      
      @scala.inline
      def setNavigationIcons(value: ICalendarIconStrings): Self = StObject.set(x, "navigationIcons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigationIconsUndefined: Self = StObject.set(x, "navigationIcons", js.undefined)
      
      @scala.inline
      def setOnHeaderSelect(value: /* focus */ Boolean => Unit): Self = StObject.set(x, "onHeaderSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHeaderSelectUndefined: Self = StObject.set(x, "onHeaderSelect", js.undefined)
      
      @scala.inline
      def setOnRenderTitle(value: /* props */ ICalendarYearHeaderProps => ReactNode): Self = StObject.set(x, "onRenderTitle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRenderTitleUndefined: Self = StObject.set(x, "onRenderTitle", js.undefined)
      
      @scala.inline
      def setOnRenderYear(value: /* year */ Double => ReactNode): Self = StObject.set(x, "onRenderYear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRenderYearUndefined: Self = StObject.set(x, "onRenderYear", js.undefined)
      
      @scala.inline
      def setOnSelectYear(value: /* year */ Double => Unit): Self = StObject.set(x, "onSelectYear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectYearUndefined: Self = StObject.set(x, "onSelectYear", js.undefined)
      
      @scala.inline
      def setSelectedYear(value: Double): Self = StObject.set(x, "selectedYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedYearUndefined: Self = StObject.set(x, "selectedYear", js.undefined)
      
      @scala.inline
      def setStrings(value: ICalendarYearStrings): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
    }
  }
  
  trait ICalendarYearRange extends StObject {
    
    var fromYear: Double
    
    var toYear: Double
  }
  object ICalendarYearRange {
    
    @scala.inline
    def apply(fromYear: Double, toYear: Double): ICalendarYearRange = {
      val __obj = js.Dynamic.literal(fromYear = fromYear.asInstanceOf[js.Any], toYear = toYear.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICalendarYearRange]
    }
    
    @scala.inline
    implicit class ICalendarYearRangeMutableBuilder[Self <: ICalendarYearRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromYear(value: Double): Self = StObject.set(x, "fromYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToYear(value: Double): Self = StObject.set(x, "toYear", value.asInstanceOf[js.Any])
    }
  }
  
  type ICalendarYearRangeToString = js.Function1[/* range */ ICalendarYearRange, String]
  
  trait ICalendarYearState extends StObject {
    
    var fromYear: Double
    
    var navigatedYear: js.UndefOr[Double] = js.undefined
    
    var selectedYear: js.UndefOr[Double] = js.undefined
  }
  object ICalendarYearState {
    
    @scala.inline
    def apply(fromYear: Double): ICalendarYearState = {
      val __obj = js.Dynamic.literal(fromYear = fromYear.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICalendarYearState]
    }
    
    @scala.inline
    implicit class ICalendarYearStateMutableBuilder[Self <: ICalendarYearState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromYear(value: Double): Self = StObject.set(x, "fromYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigatedYear(value: Double): Self = StObject.set(x, "navigatedYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigatedYearUndefined: Self = StObject.set(x, "navigatedYear", js.undefined)
      
      @scala.inline
      def setSelectedYear(value: Double): Self = StObject.set(x, "selectedYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedYearUndefined: Self = StObject.set(x, "selectedYear", js.undefined)
    }
  }
  
  trait ICalendarYearStrings extends StObject {
    
    var headerAriaLabelFormatString: js.UndefOr[String] = js.undefined
    
    var nextRangeAriaLabel: js.UndefOr[String | ICalendarYearRangeToString] = js.undefined
    
    var prevRangeAriaLabel: js.UndefOr[String | ICalendarYearRangeToString] = js.undefined
    
    var rangeAriaLabel: js.UndefOr[String | ICalendarYearRangeToString] = js.undefined
  }
  object ICalendarYearStrings {
    
    @scala.inline
    def apply(): ICalendarYearStrings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICalendarYearStrings]
    }
    
    @scala.inline
    implicit class ICalendarYearStringsMutableBuilder[Self <: ICalendarYearStrings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaderAriaLabelFormatString(value: String): Self = StObject.set(x, "headerAriaLabelFormatString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderAriaLabelFormatStringUndefined: Self = StObject.set(x, "headerAriaLabelFormatString", js.undefined)
      
      @scala.inline
      def setNextRangeAriaLabel(value: String | ICalendarYearRangeToString): Self = StObject.set(x, "nextRangeAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextRangeAriaLabelFunction1(value: /* range */ ICalendarYearRange => String): Self = StObject.set(x, "nextRangeAriaLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNextRangeAriaLabelUndefined: Self = StObject.set(x, "nextRangeAriaLabel", js.undefined)
      
      @scala.inline
      def setPrevRangeAriaLabel(value: String | ICalendarYearRangeToString): Self = StObject.set(x, "prevRangeAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevRangeAriaLabelFunction1(value: /* range */ ICalendarYearRange => String): Self = StObject.set(x, "prevRangeAriaLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrevRangeAriaLabelUndefined: Self = StObject.set(x, "prevRangeAriaLabel", js.undefined)
      
      @scala.inline
      def setRangeAriaLabel(value: String | ICalendarYearRangeToString): Self = StObject.set(x, "rangeAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeAriaLabelFunction1(value: /* range */ ICalendarYearRange => String): Self = StObject.set(x, "rangeAriaLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRangeAriaLabelUndefined: Self = StObject.set(x, "rangeAriaLabel", js.undefined)
    }
  }
}
