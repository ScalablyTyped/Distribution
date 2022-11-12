package typings.officeJsPreview.global

import org.scalablytyped.runtime.StringDictionary
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////////////////////////////////////////////////
//////////////////////// End Visio APIs ////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
//////////////////// Begin PowerPoint APIs /////////////////////
////////////////////////////////////////////////////////////////
object PowerPoint {
  
  @JSGlobal("PowerPoint")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @remarks
    * [Api set: PowerPointApi 1.0]
    */
  @JSGlobal("PowerPoint.Application")
  @js.native
  open class Application ()
    extends StObject
       with typings.officeJsPreview.PowerPoint.Application {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
    /* CompleteClass */
    @JSName("context")
    var context_Application: typings.officeJsPreview.PowerPoint.RequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
    
    /**
      * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
      * Whereas the original PowerPoint.Application object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `PowerPoint.Interfaces.ApplicationData`) that contains shallow copies of any loaded child properties from the original object.
      */
    /* CompleteClass */
    override def toJSON(): StringDictionary[String] = js.native
  }
  object Application {
    
    @JSGlobal("PowerPoint.Application")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new instance of PowerPoint.Application object
      */
    /* static member */
    inline def newObject(context: ClientRequestContext): typings.officeJsPreview.PowerPoint.Application = ^.asInstanceOf[js.Dynamic].applyDynamic("newObject")(context.asInstanceOf[js.Any]).asInstanceOf[typings.officeJsPreview.PowerPoint.Application]
  }
  
  /**
    * Represents the bullet formatting properties of a text that is attached to the {@link PowerPoint.ParagraphFormat}.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.BulletFormat")
  @js.native
  open class BulletFormat ()
    extends StObject
       with typings.officeJsPreview.PowerPoint.BulletFormat {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    * Specifies the connector type for line shapes.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.ConnectorType")
  @js.native
  object ConnectorType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.PowerPoint.ConnectorType & String] = js.native
    
    /* "Curve" */ val curve: typings.officeJsPreview.PowerPoint.ConnectorType.curve & String = js.native
    
    /* "Elbow" */ val elbow: typings.officeJsPreview.PowerPoint.ConnectorType.elbow & String = js.native
    
    /* "Straight" */ val straight: typings.officeJsPreview.PowerPoint.ConnectorType.straight & String = js.native
  }
  
  @JSGlobal("PowerPoint.ErrorCodes")
  @js.native
  object ErrorCodes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.PowerPoint.ErrorCodes & String] = js.native
    
    /* "GeneralException" */ val generalException: typings.officeJsPreview.PowerPoint.ErrorCodes.generalException & String = js.native
  }
  
  /**
    * Specifies the shape type for a `GeometricShape` object.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.GeometricShapeType")
  @js.native
  object GeometricShapeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.PowerPoint.GeometricShapeType & String] = js.native
    
    /* "AccentBorderCallout1" */ val accentBorderCallout1: typings.officeJsPreview.PowerPoint.GeometricShapeType.accentBorderCallout1 & String = js.native
    
    /* "AccentBorderCallout2" */ val accentBorderCallout2: typings.officeJsPreview.PowerPoint.GeometricShapeType.accentBorderCallout2 & String = js.native
    
    /* "AccentBorderCallout3" */ val accentBorderCallout3: typings.officeJsPreview.PowerPoint.GeometricShapeType.accentBorderCallout3 & String = js.native
    
    /* "AccentCallout1" */ val accentCallout1: typings.officeJsPreview.PowerPoint.GeometricShapeType.accentCallout1 & String = js.native
    
    /* "AccentCallout2" */ val accentCallout2: typings.officeJsPreview.PowerPoint.GeometricShapeType.accentCallout2 & String = js.native
    
    /* "AccentCallout3" */ val accentCallout3: typings.officeJsPreview.PowerPoint.GeometricShapeType.accentCallout3 & String = js.native
    
    /* "ActionButtonBackPrevious" */ val actionButtonBackPrevious: typings.officeJsPreview.PowerPoint.GeometricShapeType.actionButtonBackPrevious & String = js.native
    
    /* "ActionButtonBeginning" */ val actionButtonBeginning: typings.officeJsPreview.PowerPoint.GeometricShapeType.actionButtonBeginning & String = js.native
    
    /* "ActionButtonBlank" */ val actionButtonBlank: typings.officeJsPreview.PowerPoint.GeometricShapeType.actionButtonBlank & String = js.native
    
    /* "ActionButtonDocument" */ val actionButtonDocument: typings.officeJsPreview.PowerPoint.GeometricShapeType.actionButtonDocument & String = js.native
    
    /* "ActionButtonEnd" */ val actionButtonEnd: typings.officeJsPreview.PowerPoint.GeometricShapeType.actionButtonEnd & String = js.native
    
    /* "ActionButtonForwardNext" */ val actionButtonForwardNext: typings.officeJsPreview.PowerPoint.GeometricShapeType.actionButtonForwardNext & String = js.native
    
    /* "ActionButtonHelp" */ val actionButtonHelp: typings.officeJsPreview.PowerPoint.GeometricShapeType.actionButtonHelp & String = js.native
    
    /* "ActionButtonHome" */ val actionButtonHome: typings.officeJsPreview.PowerPoint.GeometricShapeType.actionButtonHome & String = js.native
    
    /* "ActionButtonInformation" */ val actionButtonInformation: typings.officeJsPreview.PowerPoint.GeometricShapeType.actionButtonInformation & String = js.native
    
    /* "ActionButtonMovie" */ val actionButtonMovie: typings.officeJsPreview.PowerPoint.GeometricShapeType.actionButtonMovie & String = js.native
    
    /* "ActionButtonReturn" */ val actionButtonReturn: typings.officeJsPreview.PowerPoint.GeometricShapeType.actionButtonReturn & String = js.native
    
    /* "ActionButtonSound" */ val actionButtonSound: typings.officeJsPreview.PowerPoint.GeometricShapeType.actionButtonSound & String = js.native
    
    /* "Arc" */ val arc: typings.officeJsPreview.PowerPoint.GeometricShapeType.arc & String = js.native
    
    /* "BentArrow" */ val bentArrow: typings.officeJsPreview.PowerPoint.GeometricShapeType.bentArrow & String = js.native
    
    /* "BentUpArrow" */ val bentUpArrow: typings.officeJsPreview.PowerPoint.GeometricShapeType.bentUpArrow & String = js.native
    
    /* "Bevel" */ val bevel: typings.officeJsPreview.PowerPoint.GeometricShapeType.bevel & String = js.native
    
    /* "BlockArc" */ val blockArc: typings.officeJsPreview.PowerPoint.GeometricShapeType.blockArc & String = js.native
    
    /* "BorderCallout1" */ val borderCallout1: typings.officeJsPreview.PowerPoint.GeometricShapeType.borderCallout1 & String = js.native
    
    /* "BorderCallout2" */ val borderCallout2: typings.officeJsPreview.PowerPoint.GeometricShapeType.borderCallout2 & String = js.native
    
    /* "BorderCallout3" */ val borderCallout3: typings.officeJsPreview.PowerPoint.GeometricShapeType.borderCallout3 & String = js.native
    
    /* "BracePair" */ val bracePair: typings.officeJsPreview.PowerPoint.GeometricShapeType.bracePair & String = js.native
    
    /* "BracketPair" */ val bracketPair: typings.officeJsPreview.PowerPoint.GeometricShapeType.bracketPair & String = js.native
    
    /* "Callout1" */ val callout1: typings.officeJsPreview.PowerPoint.GeometricShapeType.callout1 & String = js.native
    
    /* "Callout2" */ val callout2: typings.officeJsPreview.PowerPoint.GeometricShapeType.callout2 & String = js.native
    
    /* "Callout3" */ val callout3: typings.officeJsPreview.PowerPoint.GeometricShapeType.callout3 & String = js.native
    
    /* "Can" */ val can: typings.officeJsPreview.PowerPoint.GeometricShapeType.can & String = js.native
    
    /* "ChartPlus" */ val chartPlus: typings.officeJsPreview.PowerPoint.GeometricShapeType.chartPlus & String = js.native
    
    /* "ChartStar" */ val chartStar: typings.officeJsPreview.PowerPoint.GeometricShapeType.chartStar & String = js.native
    
    /* "ChartX" */ val chartX: typings.officeJsPreview.PowerPoint.GeometricShapeType.chartX & String = js.native
    
    /* "Chevron" */ val chevron: typings.officeJsPreview.PowerPoint.GeometricShapeType.chevron & String = js.native
    
    /* "Chord" */ val chord: typings.officeJsPreview.PowerPoint.GeometricShapeType.chord & String = js.native
    
    /* "CircularArrow" */ val circularArrow: typings.officeJsPreview.PowerPoint.GeometricShapeType.circularArrow & String = js.native
    
    /* "Cloud" */ val cloud: typings.officeJsPreview.PowerPoint.GeometricShapeType.cloud & String = js.native
    
    /* "CloudCallout" */ val cloudCallout: typings.officeJsPreview.PowerPoint.GeometricShapeType.cloudCallout & String = js.native
    
    /* "Corner" */ val corner: typings.officeJsPreview.PowerPoint.GeometricShapeType.corner & String = js.native
    
    /* "CornerTabs" */ val cornerTabs: typings.officeJsPreview.PowerPoint.GeometricShapeType.cornerTabs & String = js.native
    
    /* "Cube" */ val cube: typings.officeJsPreview.PowerPoint.GeometricShapeType.cube & String = js.native
    
    /* "CurvedDownArrow" */ val curvedDownArrow: typings.officeJsPreview.PowerPoint.GeometricShapeType.curvedDownArrow & String = js.native
    
    /* "CurvedLeftArrow" */ val curvedLeftArrow: typings.officeJsPreview.PowerPoint.GeometricShapeType.curvedLeftArrow & String = js.native
    
    /* "CurvedRightArrow" */ val curvedRightArrow: typings.officeJsPreview.PowerPoint.GeometricShapeType.curvedRightArrow & String = js.native
    
    /* "CurvedUpArrow" */ val curvedUpArrow: typings.officeJsPreview.PowerPoint.GeometricShapeType.curvedUpArrow & String = js.native
    
    /* "Decagon" */ val decagon: typings.officeJsPreview.PowerPoint.GeometricShapeType.decagon & String = js.native
    
    /* "DiagonalStripe" */ val diagonalStripe: typings.officeJsPreview.PowerPoint.GeometricShapeType.diagonalStripe & String = js.native
    
    /* "Diamond" */ val diamond: typings.officeJsPreview.PowerPoint.GeometricShapeType.diamond & String = js.native
    
    /* "Dodecagon" */ val dodecagon: typings.officeJsPreview.PowerPoint.GeometricShapeType.dodecagon & String = js.native
    
    /* "Donut" */ val donut: typings.officeJsPreview.PowerPoint.GeometricShapeType.donut & String = js.native
    
    /* "DoubleWave" */ val doubleWave: typings.officeJsPreview.PowerPoint.GeometricShapeType.doubleWave & String = js.native
    
    /* "DownArrow" */ val downArrow: typings.officeJsPreview.PowerPoint.GeometricShapeType.downArrow & String = js.native
    
    /* "DownArrowCallout" */ val downArrowCallout: typings.officeJsPreview.PowerPoint.GeometricShapeType.downArrowCallout & String = js.native
    
    /* "Ellipse" */ val ellipse: typings.officeJsPreview.PowerPoint.GeometricShapeType.ellipse & String = js.native
    
    /* "EllipseRibbon" */ val ellipseRibbon: typings.officeJsPreview.PowerPoint.GeometricShapeType.ellipseRibbon & String = js.native
    
    /* "EllipseRibbon2" */ val ellipseRibbon2: typings.officeJsPreview.PowerPoint.GeometricShapeType.ellipseRibbon2 & String = js.native
    
    /* "FlowChartAlternateProcess" */ val flowChartAlternateProcess: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartAlternateProcess & String = js.native
    
    /* "FlowChartCollate" */ val flowChartCollate: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartCollate & String = js.native
    
    /* "FlowChartConnector" */ val flowChartConnector: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartConnector & String = js.native
    
    /* "FlowChartDecision" */ val flowChartDecision: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartDecision & String = js.native
    
    /* "FlowChartDelay" */ val flowChartDelay: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartDelay & String = js.native
    
    /* "FlowChartDisplay" */ val flowChartDisplay: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartDisplay & String = js.native
    
    /* "FlowChartDocument" */ val flowChartDocument: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartDocument & String = js.native
    
    /* "FlowChartExtract" */ val flowChartExtract: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartExtract & String = js.native
    
    /* "FlowChartInputOutput" */ val flowChartInputOutput: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartInputOutput & String = js.native
    
    /* "FlowChartInternalStorage" */ val flowChartInternalStorage: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartInternalStorage & String = js.native
    
    /* "FlowChartMagneticDisk" */ val flowChartMagneticDisk: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartMagneticDisk & String = js.native
    
    /* "FlowChartMagneticDrum" */ val flowChartMagneticDrum: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartMagneticDrum & String = js.native
    
    /* "FlowChartMagneticTape" */ val flowChartMagneticTape: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartMagneticTape & String = js.native
    
    /* "FlowChartManualInput" */ val flowChartManualInput: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartManualInput & String = js.native
    
    /* "FlowChartManualOperation" */ val flowChartManualOperation: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartManualOperation & String = js.native
    
    /* "FlowChartMerge" */ val flowChartMerge: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartMerge & String = js.native
    
    /* "FlowChartMultidocument" */ val flowChartMultidocument: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartMultidocument & String = js.native
    
    /* "FlowChartOfflineStorage" */ val flowChartOfflineStorage: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartOfflineStorage & String = js.native
    
    /* "FlowChartOffpageConnector" */ val flowChartOffpageConnector: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartOffpageConnector & String = js.native
    
    /* "FlowChartOnlineStorage" */ val flowChartOnlineStorage: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartOnlineStorage & String = js.native
    
    /* "FlowChartOr" */ val flowChartOr: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartOr & String = js.native
    
    /* "FlowChartPredefinedProcess" */ val flowChartPredefinedProcess: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartPredefinedProcess & String = js.native
    
    /* "FlowChartPreparation" */ val flowChartPreparation: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartPreparation & String = js.native
    
    /* "FlowChartProcess" */ val flowChartProcess: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartProcess & String = js.native
    
    /* "FlowChartPunchedCard" */ val flowChartPunchedCard: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartPunchedCard & String = js.native
    
    /* "FlowChartPunchedTape" */ val flowChartPunchedTape: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartPunchedTape & String = js.native
    
    /* "FlowChartSort" */ val flowChartSort: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartSort & String = js.native
    
    /* "FlowChartSummingJunction" */ val flowChartSummingJunction: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartSummingJunction & String = js.native
    
    /* "FlowChartTerminator" */ val flowChartTerminator: typings.officeJsPreview.PowerPoint.GeometricShapeType.flowChartTerminator & String = js.native
    
    /* "FoldedCorner" */ val foldedCorner: typings.officeJsPreview.PowerPoint.GeometricShapeType.foldedCorner & String = js.native
    
    /* "Frame" */ val frame: typings.officeJsPreview.PowerPoint.GeometricShapeType.frame & String = js.native
    
    /* "Funnel" */ val funnel: typings.officeJsPreview.PowerPoint.GeometricShapeType.funnel & String = js.native
    
    /* "Gear6" */ val gear6: typings.officeJsPreview.PowerPoint.GeometricShapeType.gear6 & String = js.native
    
    /* "Gear9" */ val gear9: typings.officeJsPreview.PowerPoint.GeometricShapeType.gear9 & String = js.native
    
    /* "HalfFrame" */ val halfFrame: typings.officeJsPreview.PowerPoint.GeometricShapeType.halfFrame & String = js.native
    
    /* "Heart" */ val heart: typings.officeJsPreview.PowerPoint.GeometricShapeType.heart & String = js.native
    
    /* "Heptagon" */ val heptagon: typings.officeJsPreview.PowerPoint.GeometricShapeType.heptagon & String = js.native
    
    /* "Hexagon" */ val hexagon: typings.officeJsPreview.PowerPoint.GeometricShapeType.hexagon & String = js.native
    
    /* "HomePlate" */ val homePlate: typings.officeJsPreview.PowerPoint.GeometricShapeType.homePlate & String = js.native
    
    /* "HorizontalScroll" */ val horizontalScroll: typings.officeJsPreview.PowerPoint.GeometricShapeType.horizontalScroll & String = js.native
    
    /* "IrregularSeal1" */ val irregularSeal1: typings.officeJsPreview.PowerPoint.GeometricShapeType.irregularSeal1 & String = js.native
    
    /* "IrregularSeal2" */ val irregularSeal2: typings.officeJsPreview.PowerPoint.GeometricShapeType.irregularSeal2 & String = js.native
    
    /* "LeftArrow" */ val leftArrow: typings.officeJsPreview.PowerPoint.GeometricShapeType.leftArrow & String = js.native
    
    /* "LeftArrowCallout" */ val leftArrowCallout: typings.officeJsPreview.PowerPoint.GeometricShapeType.leftArrowCallout & String = js.native
    
    /* "LeftBrace" */ val leftBrace: typings.officeJsPreview.PowerPoint.GeometricShapeType.leftBrace & String = js.native
    
    /* "LeftBracket" */ val leftBracket: typings.officeJsPreview.PowerPoint.GeometricShapeType.leftBracket & String = js.native
    
    /* "LeftCircularArrow" */ val leftCircularArrow: typings.officeJsPreview.PowerPoint.GeometricShapeType.leftCircularArrow & String = js.native
    
    /* "LeftRightArrow" */ val leftRightArrow: typings.officeJsPreview.PowerPoint.GeometricShapeType.leftRightArrow & String = js.native
    
    /* "LeftRightArrowCallout" */ val leftRightArrowCallout: typings.officeJsPreview.PowerPoint.GeometricShapeType.leftRightArrowCallout & String = js.native
    
    /* "LeftRightCircularArrow" */ val leftRightCircularArrow: typings.officeJsPreview.PowerPoint.GeometricShapeType.leftRightCircularArrow & String = js.native
    
    /* "LeftRightRibbon" */ val leftRightRibbon: typings.officeJsPreview.PowerPoint.GeometricShapeType.leftRightRibbon & String = js.native
    
    /* "LeftRightUpArrow" */ val leftRightUpArrow: typings.officeJsPreview.PowerPoint.GeometricShapeType.leftRightUpArrow & String = js.native
    
    /* "LeftUpArrow" */ val leftUpArrow: typings.officeJsPreview.PowerPoint.GeometricShapeType.leftUpArrow & String = js.native
    
    /* "LightningBolt" */ val lightningBolt: typings.officeJsPreview.PowerPoint.GeometricShapeType.lightningBolt & String = js.native
    
    /* "LineInverse" */ val lineInverse: typings.officeJsPreview.PowerPoint.GeometricShapeType.lineInverse & String = js.native
    
    /* "MathDivide" */ val mathDivide: typings.officeJsPreview.PowerPoint.GeometricShapeType.mathDivide & String = js.native
    
    /* "MathEqual" */ val mathEqual: typings.officeJsPreview.PowerPoint.GeometricShapeType.mathEqual & String = js.native
    
    /* "MathMinus" */ val mathMinus: typings.officeJsPreview.PowerPoint.GeometricShapeType.mathMinus & String = js.native
    
    /* "MathMultiply" */ val mathMultiply: typings.officeJsPreview.PowerPoint.GeometricShapeType.mathMultiply & String = js.native
    
    /* "MathNotEqual" */ val mathNotEqual: typings.officeJsPreview.PowerPoint.GeometricShapeType.mathNotEqual & String = js.native
    
    /* "MathPlus" */ val mathPlus: typings.officeJsPreview.PowerPoint.GeometricShapeType.mathPlus & String = js.native
    
    /* "Moon" */ val moon: typings.officeJsPreview.PowerPoint.GeometricShapeType.moon & String = js.native
    
    /* "NoSmoking" */ val noSmoking: typings.officeJsPreview.PowerPoint.GeometricShapeType.noSmoking & String = js.native
    
    /* "NonIsoscelesTrapezoid" */ val nonIsoscelesTrapezoid: typings.officeJsPreview.PowerPoint.GeometricShapeType.nonIsoscelesTrapezoid & String = js.native
    
    /* "NotchedRightArrow" */ val notchedRightArrow: typings.officeJsPreview.PowerPoint.GeometricShapeType.notchedRightArrow & String = js.native
    
    /* "Octagon" */ val octagon: typings.officeJsPreview.PowerPoint.GeometricShapeType.octagon & String = js.native
    
    /* "Parallelogram" */ val parallelogram: typings.officeJsPreview.PowerPoint.GeometricShapeType.parallelogram & String = js.native
    
    /* "Pentagon" */ val pentagon: typings.officeJsPreview.PowerPoint.GeometricShapeType.pentagon & String = js.native
    
    /* "Pie" */ val pie: typings.officeJsPreview.PowerPoint.GeometricShapeType.pie & String = js.native
    
    /* "PieWedge" */ val pieWedge: typings.officeJsPreview.PowerPoint.GeometricShapeType.pieWedge & String = js.native
    
    /* "Plaque" */ val plaque: typings.officeJsPreview.PowerPoint.GeometricShapeType.plaque & String = js.native
    
    /* "PlaqueTabs" */ val plaqueTabs: typings.officeJsPreview.PowerPoint.GeometricShapeType.plaqueTabs & String = js.native
    
    /* "Plus" */ val plus: typings.officeJsPreview.PowerPoint.GeometricShapeType.plus & String = js.native
    
    /* "QuadArrow" */ val quadArrow: typings.officeJsPreview.PowerPoint.GeometricShapeType.quadArrow & String = js.native
    
    /* "QuadArrowCallout" */ val quadArrowCallout: typings.officeJsPreview.PowerPoint.GeometricShapeType.quadArrowCallout & String = js.native
    
    /* "Rectangle" */ val rectangle: typings.officeJsPreview.PowerPoint.GeometricShapeType.rectangle & String = js.native
    
    /* "Ribbon" */ val ribbon: typings.officeJsPreview.PowerPoint.GeometricShapeType.ribbon & String = js.native
    
    /* "Ribbon2" */ val ribbon2: typings.officeJsPreview.PowerPoint.GeometricShapeType.ribbon2 & String = js.native
    
    /* "RightArrow" */ val rightArrow: typings.officeJsPreview.PowerPoint.GeometricShapeType.rightArrow & String = js.native
    
    /* "RightArrowCallout" */ val rightArrowCallout: typings.officeJsPreview.PowerPoint.GeometricShapeType.rightArrowCallout & String = js.native
    
    /* "RightBrace" */ val rightBrace: typings.officeJsPreview.PowerPoint.GeometricShapeType.rightBrace & String = js.native
    
    /* "RightBracket" */ val rightBracket: typings.officeJsPreview.PowerPoint.GeometricShapeType.rightBracket & String = js.native
    
    /* "RightTriangle" */ val rightTriangle: typings.officeJsPreview.PowerPoint.GeometricShapeType.rightTriangle & String = js.native
    
    /* "Round1Rectangle" */ val round1Rectangle: typings.officeJsPreview.PowerPoint.GeometricShapeType.round1Rectangle & String = js.native
    
    /* "Round2DiagonalRectangle" */ val round2DiagonalRectangle: typings.officeJsPreview.PowerPoint.GeometricShapeType.round2DiagonalRectangle & String = js.native
    
    /* "Round2SameRectangle" */ val round2SameRectangle: typings.officeJsPreview.PowerPoint.GeometricShapeType.round2SameRectangle & String = js.native
    
    /* "RoundRectangle" */ val roundRectangle: typings.officeJsPreview.PowerPoint.GeometricShapeType.roundRectangle & String = js.native
    
    /* "SmileyFace" */ val smileyFace: typings.officeJsPreview.PowerPoint.GeometricShapeType.smileyFace & String = js.native
    
    /* "Snip1Rectangle" */ val snip1Rectangle: typings.officeJsPreview.PowerPoint.GeometricShapeType.snip1Rectangle & String = js.native
    
    /* "Snip2DiagonalRectangle" */ val snip2DiagonalRectangle: typings.officeJsPreview.PowerPoint.GeometricShapeType.snip2DiagonalRectangle & String = js.native
    
    /* "Snip2SameRectangle" */ val snip2SameRectangle: typings.officeJsPreview.PowerPoint.GeometricShapeType.snip2SameRectangle & String = js.native
    
    /* "SnipRoundRectangle" */ val snipRoundRectangle: typings.officeJsPreview.PowerPoint.GeometricShapeType.snipRoundRectangle & String = js.native
    
    /* "SquareTabs" */ val squareTabs: typings.officeJsPreview.PowerPoint.GeometricShapeType.squareTabs & String = js.native
    
    /* "Star10" */ val star10: typings.officeJsPreview.PowerPoint.GeometricShapeType.star10 & String = js.native
    
    /* "Star12" */ val star12: typings.officeJsPreview.PowerPoint.GeometricShapeType.star12 & String = js.native
    
    /* "Star16" */ val star16: typings.officeJsPreview.PowerPoint.GeometricShapeType.star16 & String = js.native
    
    /* "Star24" */ val star24: typings.officeJsPreview.PowerPoint.GeometricShapeType.star24 & String = js.native
    
    /* "Star32" */ val star32: typings.officeJsPreview.PowerPoint.GeometricShapeType.star32 & String = js.native
    
    /* "Star4" */ val star4: typings.officeJsPreview.PowerPoint.GeometricShapeType.star4 & String = js.native
    
    /* "Star5" */ val star5: typings.officeJsPreview.PowerPoint.GeometricShapeType.star5 & String = js.native
    
    /* "Star6" */ val star6: typings.officeJsPreview.PowerPoint.GeometricShapeType.star6 & String = js.native
    
    /* "Star7" */ val star7: typings.officeJsPreview.PowerPoint.GeometricShapeType.star7 & String = js.native
    
    /* "Star8" */ val star8: typings.officeJsPreview.PowerPoint.GeometricShapeType.star8 & String = js.native
    
    /* "StripedRightArrow" */ val stripedRightArrow: typings.officeJsPreview.PowerPoint.GeometricShapeType.stripedRightArrow & String = js.native
    
    /* "Sun" */ val sun: typings.officeJsPreview.PowerPoint.GeometricShapeType.sun & String = js.native
    
    /* "SwooshArrow" */ val swooshArrow: typings.officeJsPreview.PowerPoint.GeometricShapeType.swooshArrow & String = js.native
    
    /* "Teardrop" */ val teardrop: typings.officeJsPreview.PowerPoint.GeometricShapeType.teardrop & String = js.native
    
    /* "Trapezoid" */ val trapezoid: typings.officeJsPreview.PowerPoint.GeometricShapeType.trapezoid & String = js.native
    
    /* "Triangle" */ val triangle: typings.officeJsPreview.PowerPoint.GeometricShapeType.triangle & String = js.native
    
    /* "UpArrow" */ val upArrow: typings.officeJsPreview.PowerPoint.GeometricShapeType.upArrow & String = js.native
    
    /* "UpArrowCallout" */ val upArrowCallout: typings.officeJsPreview.PowerPoint.GeometricShapeType.upArrowCallout & String = js.native
    
    /* "UpDownArrow" */ val upDownArrow: typings.officeJsPreview.PowerPoint.GeometricShapeType.upDownArrow & String = js.native
    
    /* "UpDownArrowCallout" */ val upDownArrowCallout: typings.officeJsPreview.PowerPoint.GeometricShapeType.upDownArrowCallout & String = js.native
    
    /* "UturnArrow" */ val uturnArrow: typings.officeJsPreview.PowerPoint.GeometricShapeType.uturnArrow & String = js.native
    
    /* "VerticalScroll" */ val verticalScroll: typings.officeJsPreview.PowerPoint.GeometricShapeType.verticalScroll & String = js.native
    
    /* "Wave" */ val wave: typings.officeJsPreview.PowerPoint.GeometricShapeType.wave & String = js.native
    
    /* "WedgeEllipseCallout" */ val wedgeEllipseCallout: typings.officeJsPreview.PowerPoint.GeometricShapeType.wedgeEllipseCallout & String = js.native
    
    /* "WedgeRRectCallout" */ val wedgeRRectCallout: typings.officeJsPreview.PowerPoint.GeometricShapeType.wedgeRRectCallout & String = js.native
    
    /* "WedgeRectCallout" */ val wedgeRectCallout: typings.officeJsPreview.PowerPoint.GeometricShapeType.wedgeRectCallout & String = js.native
  }
  
  /**
    * Specifies the formatting options for when slides are inserted.
    *
    * @remarks
    * [Api set: PowerPointApi 1.2]
    */
  @JSGlobal("PowerPoint.InsertSlideFormatting")
  @js.native
  object InsertSlideFormatting extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.PowerPoint.InsertSlideFormatting & String] = js.native
    
    /* "KeepSourceFormatting" */ val keepSourceFormatting: typings.officeJsPreview.PowerPoint.InsertSlideFormatting.keepSourceFormatting & String = js.native
    
    /* "UseDestinationTheme" */ val useDestinationTheme: typings.officeJsPreview.PowerPoint.InsertSlideFormatting.useDestinationTheme & String = js.native
  }
  
  /**
    * Represents the paragraph formatting properties of a text that is attached to the {@link PowerPoint.TextRange}.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.ParagraphFormat")
  @js.native
  open class ParagraphFormat ()
    extends StObject
       with typings.officeJsPreview.PowerPoint.ParagraphFormat {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    * Represents the horizontal alignment of the {@link PowerPoint.TextFrame} in a {@link PowerPoint.Shape}.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.ParagraphHorizontalAlignment")
  @js.native
  object ParagraphHorizontalAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.PowerPoint.ParagraphHorizontalAlignment & String] = js.native
    
    /* "Center" */ val center: typings.officeJsPreview.PowerPoint.ParagraphHorizontalAlignment.center & String = js.native
    
    /* "Distributed" */ val distributed: typings.officeJsPreview.PowerPoint.ParagraphHorizontalAlignment.distributed & String = js.native
    
    /* "Justify" */ val justify: typings.officeJsPreview.PowerPoint.ParagraphHorizontalAlignment.justify & String = js.native
    
    /* "JustifyLow" */ val justifyLow: typings.officeJsPreview.PowerPoint.ParagraphHorizontalAlignment.justifyLow & String = js.native
    
    /* "Left" */ val left: typings.officeJsPreview.PowerPoint.ParagraphHorizontalAlignment.left & String = js.native
    
    /* "Right" */ val right: typings.officeJsPreview.PowerPoint.ParagraphHorizontalAlignment.right & String = js.native
    
    /* "ThaiDistributed" */ val thaiDistributed: typings.officeJsPreview.PowerPoint.ParagraphHorizontalAlignment.thaiDistributed & String = js.native
  }
  
  /**
    * @remarks
    * [Api set: PowerPointApi 1.0]
    */
  @JSGlobal("PowerPoint.Presentation")
  @js.native
  open class Presentation ()
    extends StObject
       with typings.officeJsPreview.PowerPoint.Presentation {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    * The RequestContext object facilitates requests to the PowerPoint application. Since the Office add-in and the PowerPoint application run in two different processes, the request context is required to get access to the PowerPoint object model from the add-in.
    */
  @JSGlobal("PowerPoint.RequestContext")
  @js.native
  open class RequestContext ()
    extends StObject
       with typings.officeJsPreview.PowerPoint.RequestContext {
    def this(url: String) = this()
  }
  
  /**
    * Represents a single shape in the slide.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  @JSGlobal("PowerPoint.Shape")
  @js.native
  open class Shape ()
    extends StObject
       with typings.officeJsPreview.PowerPoint.Shape {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    * Determines the type of automatic sizing allowed.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.ShapeAutoSize")
  @js.native
  object ShapeAutoSize extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.PowerPoint.ShapeAutoSize & String] = js.native
    
    /* "AutoSizeMixed" */ val autoSizeMixed: typings.officeJsPreview.PowerPoint.ShapeAutoSize.autoSizeMixed & String = js.native
    
    /* "AutoSizeNone" */ val autoSizeNone: typings.officeJsPreview.PowerPoint.ShapeAutoSize.autoSizeNone & String = js.native
    
    /* "AutoSizeShapeToFitText" */ val autoSizeShapeToFitText: typings.officeJsPreview.PowerPoint.ShapeAutoSize.autoSizeShapeToFitText & String = js.native
    
    /* "AutoSizeTextToFitShape" */ val autoSizeTextToFitShape: typings.officeJsPreview.PowerPoint.ShapeAutoSize.autoSizeTextToFitShape & String = js.native
  }
  
  /**
    * Represents the collection of shapes.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  @JSGlobal("PowerPoint.ShapeCollection")
  @js.native
  open class ShapeCollection ()
    extends StObject
       with typings.officeJsPreview.PowerPoint.ShapeCollection {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    * Represents the fill formatting of a shape object.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.ShapeFill")
  @js.native
  open class ShapeFill ()
    extends StObject
       with typings.officeJsPreview.PowerPoint.ShapeFill {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    * Specifies a shape's fill type.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.ShapeFillType")
  @js.native
  object ShapeFillType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.PowerPoint.ShapeFillType & String] = js.native
    
    /* "Gradient" */ val gradient: typings.officeJsPreview.PowerPoint.ShapeFillType.gradient & String = js.native
    
    /* "NoFill" */ val noFill: typings.officeJsPreview.PowerPoint.ShapeFillType.noFill & String = js.native
    
    /* "Pattern" */ val pattern: typings.officeJsPreview.PowerPoint.ShapeFillType.pattern & String = js.native
    
    /* "PictureAndTexture" */ val pictureAndTexture: typings.officeJsPreview.PowerPoint.ShapeFillType.pictureAndTexture & String = js.native
    
    /* "SlideBackground" */ val slideBackground: typings.officeJsPreview.PowerPoint.ShapeFillType.slideBackground & String = js.native
    
    /* "Solid" */ val solid: typings.officeJsPreview.PowerPoint.ShapeFillType.solid & String = js.native
  }
  
  /**
    * Represents the font attributes, such as font name, font size, and color, for a shape's TextRange object.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.ShapeFont")
  @js.native
  open class ShapeFont ()
    extends StObject
       with typings.officeJsPreview.PowerPoint.ShapeFont {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    * The type of underline applied to a font.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.ShapeFontUnderlineStyle")
  @js.native
  object ShapeFontUnderlineStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle & String] = js.native
    
    /* "Dash" */ val dash: typings.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.dash & String = js.native
    
    /* "DashHeavy" */ val dashHeavy: typings.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.dashHeavy & String = js.native
    
    /* "DashLong" */ val dashLong: typings.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.dashLong & String = js.native
    
    /* "DashLongHeavy" */ val dashLongHeavy: typings.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.dashLongHeavy & String = js.native
    
    /* "DotDash" */ val dotDash: typings.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.dotDash & String = js.native
    
    /* "DotDashHeavy" */ val dotDashHeavy: typings.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.dotDashHeavy & String = js.native
    
    /* "DotDotDash" */ val dotDotDash: typings.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.dotDotDash & String = js.native
    
    /* "DotDotDashHeavy" */ val dotDotDashHeavy: typings.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.dotDotDashHeavy & String = js.native
    
    /* "Dotted" */ val dotted: typings.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.dotted & String = js.native
    
    /* "DottedHeavy" */ val dottedHeavy: typings.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.dottedHeavy & String = js.native
    
    /* "Double" */ val double: typings.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.double & String = js.native
    
    /* "Heavy" */ val heavy: typings.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.heavy & String = js.native
    
    /* "None" */ val none: typings.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.none & String = js.native
    
    /* "Single" */ val single: typings.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.single & String = js.native
    
    /* "Wavy" */ val wavy: typings.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.wavy & String = js.native
    
    /* "WavyDouble" */ val wavyDouble: typings.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.wavyDouble & String = js.native
    
    /* "WavyHeavy" */ val wavyHeavy: typings.officeJsPreview.PowerPoint.ShapeFontUnderlineStyle.wavyHeavy & String = js.native
  }
  
  /**
    * Specifies the dash style for a line.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.ShapeLineDashStyle")
  @js.native
  object ShapeLineDashStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.PowerPoint.ShapeLineDashStyle & String] = js.native
    
    /* "Dash" */ val dash: typings.officeJsPreview.PowerPoint.ShapeLineDashStyle.dash & String = js.native
    
    /* "DashDot" */ val dashDot: typings.officeJsPreview.PowerPoint.ShapeLineDashStyle.dashDot & String = js.native
    
    /* "DashDotDot" */ val dashDotDot: typings.officeJsPreview.PowerPoint.ShapeLineDashStyle.dashDotDot & String = js.native
    
    /* "LongDash" */ val longDash: typings.officeJsPreview.PowerPoint.ShapeLineDashStyle.longDash & String = js.native
    
    /* "LongDashDot" */ val longDashDot: typings.officeJsPreview.PowerPoint.ShapeLineDashStyle.longDashDot & String = js.native
    
    /* "LongDashDotDot" */ val longDashDotDot: typings.officeJsPreview.PowerPoint.ShapeLineDashStyle.longDashDotDot & String = js.native
    
    /* "RoundDot" */ val roundDot: typings.officeJsPreview.PowerPoint.ShapeLineDashStyle.roundDot & String = js.native
    
    /* "Solid" */ val solid: typings.officeJsPreview.PowerPoint.ShapeLineDashStyle.solid & String = js.native
    
    /* "SquareDot" */ val squareDot: typings.officeJsPreview.PowerPoint.ShapeLineDashStyle.squareDot & String = js.native
    
    /* "SystemDash" */ val systemDash: typings.officeJsPreview.PowerPoint.ShapeLineDashStyle.systemDash & String = js.native
    
    /* "SystemDashDot" */ val systemDashDot: typings.officeJsPreview.PowerPoint.ShapeLineDashStyle.systemDashDot & String = js.native
    
    /* "SystemDot" */ val systemDot: typings.officeJsPreview.PowerPoint.ShapeLineDashStyle.systemDot & String = js.native
  }
  
  /**
    * Represents the line formatting for the shape object. For images and geometric shapes, line formatting represents the border of the shape.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.ShapeLineFormat")
  @js.native
  open class ShapeLineFormat ()
    extends StObject
       with typings.officeJsPreview.PowerPoint.ShapeLineFormat {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    * Specifies the style for a line.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.ShapeLineStyle")
  @js.native
  object ShapeLineStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.PowerPoint.ShapeLineStyle & String] = js.native
    
    /* "Single" */ val single: typings.officeJsPreview.PowerPoint.ShapeLineStyle.single & String = js.native
    
    /* "ThickBetweenThin" */ val thickBetweenThin: typings.officeJsPreview.PowerPoint.ShapeLineStyle.thickBetweenThin & String = js.native
    
    /* "ThickThin" */ val thickThin: typings.officeJsPreview.PowerPoint.ShapeLineStyle.thickThin & String = js.native
    
    /* "ThinThick" */ val thinThick: typings.officeJsPreview.PowerPoint.ShapeLineStyle.thinThick & String = js.native
    
    /* "ThinThin" */ val thinThin: typings.officeJsPreview.PowerPoint.ShapeLineStyle.thinThin & String = js.native
  }
  
  /**
    * Represents a collection of shapes.
    *
    * @remarks
    * [Api set: PowerPointApi 1.5]
    */
  @JSGlobal("PowerPoint.ShapeScopedCollection")
  @js.native
  open class ShapeScopedCollection ()
    extends StObject
       with typings.officeJsPreview.PowerPoint.ShapeScopedCollection {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    * Specifies the type of a shape.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.ShapeType")
  @js.native
  object ShapeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.PowerPoint.ShapeType & String] = js.native
    
    /* "GeometricShape" */ val geometricShape: typings.officeJsPreview.PowerPoint.ShapeType.geometricShape & String = js.native
    
    /* "Group" */ val group: typings.officeJsPreview.PowerPoint.ShapeType.group & String = js.native
    
    /* "Image" */ val image: typings.officeJsPreview.PowerPoint.ShapeType.image & String = js.native
    
    /* "Line" */ val line: typings.officeJsPreview.PowerPoint.ShapeType.line & String = js.native
    
    /* "Unsupported" */ val unsupported: typings.officeJsPreview.PowerPoint.ShapeType.unsupported & String = js.native
  }
  
  /**
    * Represents a single slide of a presentation.
    *
    * @remarks
    * [Api set: PowerPointApi 1.2]
    */
  @JSGlobal("PowerPoint.Slide")
  @js.native
  open class Slide ()
    extends StObject
       with typings.officeJsPreview.PowerPoint.Slide {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    * Represents the collection of slides in the presentation.
    *
    * @remarks
    * [Api set: PowerPointApi 1.2]
    */
  @JSGlobal("PowerPoint.SlideCollection")
  @js.native
  open class SlideCollection ()
    extends StObject
       with typings.officeJsPreview.PowerPoint.SlideCollection {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    * Represents the layout of a slide.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  @JSGlobal("PowerPoint.SlideLayout")
  @js.native
  open class SlideLayout ()
    extends StObject
       with typings.officeJsPreview.PowerPoint.SlideLayout {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    * Represents the collection of layouts provided by the Slide Master for slides.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  @JSGlobal("PowerPoint.SlideLayoutCollection")
  @js.native
  open class SlideLayoutCollection ()
    extends StObject
       with typings.officeJsPreview.PowerPoint.SlideLayoutCollection {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    * Represents the Slide Master of a slide.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  @JSGlobal("PowerPoint.SlideMaster")
  @js.native
  open class SlideMaster ()
    extends StObject
       with typings.officeJsPreview.PowerPoint.SlideMaster {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    * Represents the collection of Slide Masters in the presentation.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  @JSGlobal("PowerPoint.SlideMasterCollection")
  @js.native
  open class SlideMasterCollection ()
    extends StObject
       with typings.officeJsPreview.PowerPoint.SlideMasterCollection {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    * Represents a collection of slides in the presentation.
    *
    * @remarks
    * [Api set: PowerPointApi 1.5]
    */
  @JSGlobal("PowerPoint.SlideScopedCollection")
  @js.native
  open class SlideScopedCollection ()
    extends StObject
       with typings.officeJsPreview.PowerPoint.SlideScopedCollection {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    * Represents a single tag in the slide.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  @JSGlobal("PowerPoint.Tag")
  @js.native
  open class Tag ()
    extends StObject
       with typings.officeJsPreview.PowerPoint.Tag {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    * Represents the collection of tags.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  @JSGlobal("PowerPoint.TagCollection")
  @js.native
  open class TagCollection ()
    extends StObject
       with typings.officeJsPreview.PowerPoint.TagCollection {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    * Represents the text frame of a shape object.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.TextFrame")
  @js.native
  open class TextFrame ()
    extends StObject
       with typings.officeJsPreview.PowerPoint.TextFrame {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    * Contains the text that is attached to a shape, in addition to properties and methods for manipulating the text.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.TextRange")
  @js.native
  open class TextRange ()
    extends StObject
       with typings.officeJsPreview.PowerPoint.TextRange {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    
    /**
      *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
      * isNullObject property.
      */
    /* CompleteClass */
    var isNullObject: Boolean = js.native
  }
  
  /**
    * Represents the vertical alignment of a {@link PowerPoint.TextFrame} in a {@link PowerPoint.Shape}.
    If one the centered options are selected, the contents of the `TextFrame` will be centered horizontally within the `Shape` as a group.
    To change the horizontal alignment of a text, see {@link PowerPoint.ParagraphFormat} and {@link PowerPoint.ParagraphHorizontalAlignment }.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  @JSGlobal("PowerPoint.TextVerticalAlignment")
  @js.native
  object TextVerticalAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJsPreview.PowerPoint.TextVerticalAlignment & String] = js.native
    
    /* "Bottom" */ val bottom: typings.officeJsPreview.PowerPoint.TextVerticalAlignment.bottom & String = js.native
    
    /* "BottomCentered" */ val bottomCentered: typings.officeJsPreview.PowerPoint.TextVerticalAlignment.bottomCentered & String = js.native
    
    /* "Middle" */ val middle: typings.officeJsPreview.PowerPoint.TextVerticalAlignment.middle & String = js.native
    
    /* "MiddleCentered" */ val middleCentered: typings.officeJsPreview.PowerPoint.TextVerticalAlignment.middleCentered & String = js.native
    
    /* "Top" */ val top: typings.officeJsPreview.PowerPoint.TextVerticalAlignment.top & String = js.native
    
    /* "TopCentered" */ val topCentered: typings.officeJsPreview.PowerPoint.TextVerticalAlignment.topCentered & String = js.native
  }
  
  /**
    * Creates and opens a new presentation. Optionally, the presentation can be pre-populated with a base64-encoded .pptx file.
    *
    * [Api set: PowerPointApi 1.1]
    *
    * @param base64File Optional. The base64-encoded .pptx file. The default value is null.
    */
  inline def createPresentation(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPresentation")().asInstanceOf[js.Promise[Unit]]
  inline def createPresentation(base64File: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPresentation")(base64File.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Executes a batch script that performs actions on the PowerPoint object model, using a new RequestContext. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the PowerPoint application. Since the Office add-in and the PowerPoint application run in two different processes, the RequestContext is required to get access to the PowerPoint object model from the add-in.
    */
  inline def run[T](
    batch: js.Function1[/* context */ typings.officeJsPreview.PowerPoint.RequestContext, js.Promise[T]]
  ): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(batch.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  /**
    * Executes a batch script that performs actions on the PowerPoint object model, using the RequestContext of previously-created API objects.
    * @param objects - An array of previously-created API objects. The array will be validated to make sure that all of the objects share the same context. The batch will use this shared RequestContext, which means that any changes applied to these objects will be picked up by "context.sync()".
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the PowerPoint application. Since the Office add-in and the PowerPoint application run in two different processes, the RequestContext is required to get access to the PowerPoint object model from the add-in.
    */
  inline def run[T](
    objects: js.Array[ClientObject],
    batch: js.Function1[/* context */ typings.officeJsPreview.PowerPoint.RequestContext, js.Promise[T]]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(objects.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  /**
    * Executes a batch script that performs actions on the PowerPoint object model, using the RequestContext of a previously-created API object. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    * @param object - A previously-created API object. The batch will use the same RequestContext as the passed-in object, which means that any changes applied to the object will be picked up by "context.sync()".
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the PowerPoint application. Since the Office add-in and the PowerPoint application run in two different processes, the RequestContext is required to get access to the PowerPoint object model from the add-in.
    */
  inline def run[T](
    `object`: ClientObject,
    batch: js.Function1[/* context */ typings.officeJsPreview.PowerPoint.RequestContext, js.Promise[T]]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(`object`.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
