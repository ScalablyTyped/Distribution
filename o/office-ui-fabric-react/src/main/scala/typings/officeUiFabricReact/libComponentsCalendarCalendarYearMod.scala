package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsCalendarCalendarDottypesMod.ICalendarIconStrings
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCalendarCalendarYearMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Calendar/CalendarYear", "CalendarYear")
  @js.native
  open class CalendarYear protected ()
    extends Component[ICalendarYearProps, ICalendarYearState, Any]
       with ICalendarYear {
    def this(props: ICalendarYearProps) = this()
    
    /* private */ var _calculateInitialStateFromProps: Any = js.native
    
    /* private */ var _gridRef: Any = js.native
    
    /* private */ var _onNavNext: Any = js.native
    
    /* private */ var _onNavPrev: Any = js.native
    
    /* private */ var _renderGrid: Any = js.native
    
    /* private */ var _renderHeader: Any = js.native
    
    /* CompleteClass */
    override def focus(): Unit = js.native
  }
  
  trait ICalendarYear extends StObject {
    
    def focus(): Unit
  }
  object ICalendarYear {
    
    inline def apply(focus: () => Unit): ICalendarYear = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[ICalendarYear]
    }
    
    extension [Self <: ICalendarYear](x: Self) {
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
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
    
    inline def apply(fromYear: Double, toYear: Double): ICalendarYearHeaderProps = {
      val __obj = js.Dynamic.literal(fromYear = fromYear.asInstanceOf[js.Any], toYear = toYear.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICalendarYearHeaderProps]
    }
    
    extension [Self <: ICalendarYearHeaderProps](x: Self) {
      
      inline def setOnSelectNext(value: () => Unit): Self = StObject.set(x, "onSelectNext", js.Any.fromFunction0(value))
      
      inline def setOnSelectNextUndefined: Self = StObject.set(x, "onSelectNext", js.undefined)
      
      inline def setOnSelectPrev(value: () => Unit): Self = StObject.set(x, "onSelectPrev", js.Any.fromFunction0(value))
      
      inline def setOnSelectPrevUndefined: Self = StObject.set(x, "onSelectPrev", js.undefined)
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
    
    inline def apply(): ICalendarYearProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICalendarYearProps]
    }
    
    extension [Self <: ICalendarYearProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setMaxYear(value: Double): Self = StObject.set(x, "maxYear", value.asInstanceOf[js.Any])
      
      inline def setMaxYearUndefined: Self = StObject.set(x, "maxYear", js.undefined)
      
      inline def setMinYear(value: Double): Self = StObject.set(x, "minYear", value.asInstanceOf[js.Any])
      
      inline def setMinYearUndefined: Self = StObject.set(x, "minYear", js.undefined)
      
      inline def setNavigatedYear(value: Double): Self = StObject.set(x, "navigatedYear", value.asInstanceOf[js.Any])
      
      inline def setNavigatedYearUndefined: Self = StObject.set(x, "navigatedYear", js.undefined)
      
      inline def setNavigationIcons(value: ICalendarIconStrings): Self = StObject.set(x, "navigationIcons", value.asInstanceOf[js.Any])
      
      inline def setNavigationIconsUndefined: Self = StObject.set(x, "navigationIcons", js.undefined)
      
      inline def setOnHeaderSelect(value: /* focus */ Boolean => Unit): Self = StObject.set(x, "onHeaderSelect", js.Any.fromFunction1(value))
      
      inline def setOnHeaderSelectUndefined: Self = StObject.set(x, "onHeaderSelect", js.undefined)
      
      inline def setOnRenderTitle(value: /* props */ ICalendarYearHeaderProps => ReactNode): Self = StObject.set(x, "onRenderTitle", js.Any.fromFunction1(value))
      
      inline def setOnRenderTitleUndefined: Self = StObject.set(x, "onRenderTitle", js.undefined)
      
      inline def setOnRenderYear(value: /* year */ Double => ReactNode): Self = StObject.set(x, "onRenderYear", js.Any.fromFunction1(value))
      
      inline def setOnRenderYearUndefined: Self = StObject.set(x, "onRenderYear", js.undefined)
      
      inline def setOnSelectYear(value: /* year */ Double => Unit): Self = StObject.set(x, "onSelectYear", js.Any.fromFunction1(value))
      
      inline def setOnSelectYearUndefined: Self = StObject.set(x, "onSelectYear", js.undefined)
      
      inline def setSelectedYear(value: Double): Self = StObject.set(x, "selectedYear", value.asInstanceOf[js.Any])
      
      inline def setSelectedYearUndefined: Self = StObject.set(x, "selectedYear", js.undefined)
      
      inline def setStrings(value: ICalendarYearStrings): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
      
      inline def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
    }
  }
  
  trait ICalendarYearRange extends StObject {
    
    var fromYear: Double
    
    var toYear: Double
  }
  object ICalendarYearRange {
    
    inline def apply(fromYear: Double, toYear: Double): ICalendarYearRange = {
      val __obj = js.Dynamic.literal(fromYear = fromYear.asInstanceOf[js.Any], toYear = toYear.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICalendarYearRange]
    }
    
    extension [Self <: ICalendarYearRange](x: Self) {
      
      inline def setFromYear(value: Double): Self = StObject.set(x, "fromYear", value.asInstanceOf[js.Any])
      
      inline def setToYear(value: Double): Self = StObject.set(x, "toYear", value.asInstanceOf[js.Any])
    }
  }
  
  type ICalendarYearRangeToString = js.Function1[/* range */ ICalendarYearRange, String]
  
  trait ICalendarYearState extends StObject {
    
    var fromYear: Double
    
    var navigatedYear: js.UndefOr[Double] = js.undefined
    
    var selectedYear: js.UndefOr[Double] = js.undefined
  }
  object ICalendarYearState {
    
    inline def apply(fromYear: Double): ICalendarYearState = {
      val __obj = js.Dynamic.literal(fromYear = fromYear.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICalendarYearState]
    }
    
    extension [Self <: ICalendarYearState](x: Self) {
      
      inline def setFromYear(value: Double): Self = StObject.set(x, "fromYear", value.asInstanceOf[js.Any])
      
      inline def setNavigatedYear(value: Double): Self = StObject.set(x, "navigatedYear", value.asInstanceOf[js.Any])
      
      inline def setNavigatedYearUndefined: Self = StObject.set(x, "navigatedYear", js.undefined)
      
      inline def setSelectedYear(value: Double): Self = StObject.set(x, "selectedYear", value.asInstanceOf[js.Any])
      
      inline def setSelectedYearUndefined: Self = StObject.set(x, "selectedYear", js.undefined)
    }
  }
  
  trait ICalendarYearStrings extends StObject {
    
    var headerAriaLabelFormatString: js.UndefOr[String] = js.undefined
    
    var nextRangeAriaLabel: js.UndefOr[String | ICalendarYearRangeToString] = js.undefined
    
    var prevRangeAriaLabel: js.UndefOr[String | ICalendarYearRangeToString] = js.undefined
    
    var rangeAriaLabel: js.UndefOr[String | ICalendarYearRangeToString] = js.undefined
  }
  object ICalendarYearStrings {
    
    inline def apply(): ICalendarYearStrings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICalendarYearStrings]
    }
    
    extension [Self <: ICalendarYearStrings](x: Self) {
      
      inline def setHeaderAriaLabelFormatString(value: String): Self = StObject.set(x, "headerAriaLabelFormatString", value.asInstanceOf[js.Any])
      
      inline def setHeaderAriaLabelFormatStringUndefined: Self = StObject.set(x, "headerAriaLabelFormatString", js.undefined)
      
      inline def setNextRangeAriaLabel(value: String | ICalendarYearRangeToString): Self = StObject.set(x, "nextRangeAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNextRangeAriaLabelFunction1(value: /* range */ ICalendarYearRange => String): Self = StObject.set(x, "nextRangeAriaLabel", js.Any.fromFunction1(value))
      
      inline def setNextRangeAriaLabelUndefined: Self = StObject.set(x, "nextRangeAriaLabel", js.undefined)
      
      inline def setPrevRangeAriaLabel(value: String | ICalendarYearRangeToString): Self = StObject.set(x, "prevRangeAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setPrevRangeAriaLabelFunction1(value: /* range */ ICalendarYearRange => String): Self = StObject.set(x, "prevRangeAriaLabel", js.Any.fromFunction1(value))
      
      inline def setPrevRangeAriaLabelUndefined: Self = StObject.set(x, "prevRangeAriaLabel", js.undefined)
      
      inline def setRangeAriaLabel(value: String | ICalendarYearRangeToString): Self = StObject.set(x, "rangeAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setRangeAriaLabelFunction1(value: /* range */ ICalendarYearRange => String): Self = StObject.set(x, "rangeAriaLabel", js.Any.fromFunction1(value))
      
      inline def setRangeAriaLabelUndefined: Self = StObject.set(x, "rangeAriaLabel", js.undefined)
    }
  }
}
