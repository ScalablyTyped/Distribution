package typings.officeJs.global

import org.scalablytyped.runtime.StringDictionary
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientRequestContext
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
       with typings.officeJs.PowerPoint.Application {
    
    /** The request context associated with the object */
    /* CompleteClass */
    var context: ClientRequestContext = js.native
    /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
    /* CompleteClass */
    @JSName("context")
    var context_Application: typings.officeJs.PowerPoint.RequestContext = js.native
    
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
    inline def newObject(context: ClientRequestContext): typings.officeJs.PowerPoint.Application = ^.asInstanceOf[js.Dynamic].applyDynamic("newObject")(context.asInstanceOf[js.Any]).asInstanceOf[typings.officeJs.PowerPoint.Application]
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
       with typings.officeJs.PowerPoint.BulletFormat {
    
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
    def apply(value: String): js.UndefOr[typings.officeJs.PowerPoint.ConnectorType & String] = js.native
    
    /* "Curve" */ val curve: typings.officeJs.PowerPoint.ConnectorType.curve & String = js.native
    
    /* "Elbow" */ val elbow: typings.officeJs.PowerPoint.ConnectorType.elbow & String = js.native
    
    /* "Straight" */ val straight: typings.officeJs.PowerPoint.ConnectorType.straight & String = js.native
  }
  
  @JSGlobal("PowerPoint.ErrorCodes")
  @js.native
  object ErrorCodes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.officeJs.PowerPoint.ErrorCodes & String] = js.native
    
    /* "GeneralException" */ val generalException: typings.officeJs.PowerPoint.ErrorCodes.generalException & String = js.native
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
    def apply(value: String): js.UndefOr[typings.officeJs.PowerPoint.GeometricShapeType & String] = js.native
    
    /* "AccentBorderCallout1" */ val accentBorderCallout1: typings.officeJs.PowerPoint.GeometricShapeType.accentBorderCallout1 & String = js.native
    
    /* "AccentBorderCallout2" */ val accentBorderCallout2: typings.officeJs.PowerPoint.GeometricShapeType.accentBorderCallout2 & String = js.native
    
    /* "AccentBorderCallout3" */ val accentBorderCallout3: typings.officeJs.PowerPoint.GeometricShapeType.accentBorderCallout3 & String = js.native
    
    /* "AccentCallout1" */ val accentCallout1: typings.officeJs.PowerPoint.GeometricShapeType.accentCallout1 & String = js.native
    
    /* "AccentCallout2" */ val accentCallout2: typings.officeJs.PowerPoint.GeometricShapeType.accentCallout2 & String = js.native
    
    /* "AccentCallout3" */ val accentCallout3: typings.officeJs.PowerPoint.GeometricShapeType.accentCallout3 & String = js.native
    
    /* "ActionButtonBackPrevious" */ val actionButtonBackPrevious: typings.officeJs.PowerPoint.GeometricShapeType.actionButtonBackPrevious & String = js.native
    
    /* "ActionButtonBeginning" */ val actionButtonBeginning: typings.officeJs.PowerPoint.GeometricShapeType.actionButtonBeginning & String = js.native
    
    /* "ActionButtonBlank" */ val actionButtonBlank: typings.officeJs.PowerPoint.GeometricShapeType.actionButtonBlank & String = js.native
    
    /* "ActionButtonDocument" */ val actionButtonDocument: typings.officeJs.PowerPoint.GeometricShapeType.actionButtonDocument & String = js.native
    
    /* "ActionButtonEnd" */ val actionButtonEnd: typings.officeJs.PowerPoint.GeometricShapeType.actionButtonEnd & String = js.native
    
    /* "ActionButtonForwardNext" */ val actionButtonForwardNext: typings.officeJs.PowerPoint.GeometricShapeType.actionButtonForwardNext & String = js.native
    
    /* "ActionButtonHelp" */ val actionButtonHelp: typings.officeJs.PowerPoint.GeometricShapeType.actionButtonHelp & String = js.native
    
    /* "ActionButtonHome" */ val actionButtonHome: typings.officeJs.PowerPoint.GeometricShapeType.actionButtonHome & String = js.native
    
    /* "ActionButtonInformation" */ val actionButtonInformation: typings.officeJs.PowerPoint.GeometricShapeType.actionButtonInformation & String = js.native
    
    /* "ActionButtonMovie" */ val actionButtonMovie: typings.officeJs.PowerPoint.GeometricShapeType.actionButtonMovie & String = js.native
    
    /* "ActionButtonReturn" */ val actionButtonReturn: typings.officeJs.PowerPoint.GeometricShapeType.actionButtonReturn & String = js.native
    
    /* "ActionButtonSound" */ val actionButtonSound: typings.officeJs.PowerPoint.GeometricShapeType.actionButtonSound & String = js.native
    
    /* "Arc" */ val arc: typings.officeJs.PowerPoint.GeometricShapeType.arc & String = js.native
    
    /* "BentArrow" */ val bentArrow: typings.officeJs.PowerPoint.GeometricShapeType.bentArrow & String = js.native
    
    /* "BentUpArrow" */ val bentUpArrow: typings.officeJs.PowerPoint.GeometricShapeType.bentUpArrow & String = js.native
    
    /* "Bevel" */ val bevel: typings.officeJs.PowerPoint.GeometricShapeType.bevel & String = js.native
    
    /* "BlockArc" */ val blockArc: typings.officeJs.PowerPoint.GeometricShapeType.blockArc & String = js.native
    
    /* "BorderCallout1" */ val borderCallout1: typings.officeJs.PowerPoint.GeometricShapeType.borderCallout1 & String = js.native
    
    /* "BorderCallout2" */ val borderCallout2: typings.officeJs.PowerPoint.GeometricShapeType.borderCallout2 & String = js.native
    
    /* "BorderCallout3" */ val borderCallout3: typings.officeJs.PowerPoint.GeometricShapeType.borderCallout3 & String = js.native
    
    /* "BracePair" */ val bracePair: typings.officeJs.PowerPoint.GeometricShapeType.bracePair & String = js.native
    
    /* "BracketPair" */ val bracketPair: typings.officeJs.PowerPoint.GeometricShapeType.bracketPair & String = js.native
    
    /* "Callout1" */ val callout1: typings.officeJs.PowerPoint.GeometricShapeType.callout1 & String = js.native
    
    /* "Callout2" */ val callout2: typings.officeJs.PowerPoint.GeometricShapeType.callout2 & String = js.native
    
    /* "Callout3" */ val callout3: typings.officeJs.PowerPoint.GeometricShapeType.callout3 & String = js.native
    
    /* "Can" */ val can: typings.officeJs.PowerPoint.GeometricShapeType.can & String = js.native
    
    /* "ChartPlus" */ val chartPlus: typings.officeJs.PowerPoint.GeometricShapeType.chartPlus & String = js.native
    
    /* "ChartStar" */ val chartStar: typings.officeJs.PowerPoint.GeometricShapeType.chartStar & String = js.native
    
    /* "ChartX" */ val chartX: typings.officeJs.PowerPoint.GeometricShapeType.chartX & String = js.native
    
    /* "Chevron" */ val chevron: typings.officeJs.PowerPoint.GeometricShapeType.chevron & String = js.native
    
    /* "Chord" */ val chord: typings.officeJs.PowerPoint.GeometricShapeType.chord & String = js.native
    
    /* "CircularArrow" */ val circularArrow: typings.officeJs.PowerPoint.GeometricShapeType.circularArrow & String = js.native
    
    /* "Cloud" */ val cloud: typings.officeJs.PowerPoint.GeometricShapeType.cloud & String = js.native
    
    /* "CloudCallout" */ val cloudCallout: typings.officeJs.PowerPoint.GeometricShapeType.cloudCallout & String = js.native
    
    /* "Corner" */ val corner: typings.officeJs.PowerPoint.GeometricShapeType.corner & String = js.native
    
    /* "CornerTabs" */ val cornerTabs: typings.officeJs.PowerPoint.GeometricShapeType.cornerTabs & String = js.native
    
    /* "Cube" */ val cube: typings.officeJs.PowerPoint.GeometricShapeType.cube & String = js.native
    
    /* "CurvedDownArrow" */ val curvedDownArrow: typings.officeJs.PowerPoint.GeometricShapeType.curvedDownArrow & String = js.native
    
    /* "CurvedLeftArrow" */ val curvedLeftArrow: typings.officeJs.PowerPoint.GeometricShapeType.curvedLeftArrow & String = js.native
    
    /* "CurvedRightArrow" */ val curvedRightArrow: typings.officeJs.PowerPoint.GeometricShapeType.curvedRightArrow & String = js.native
    
    /* "CurvedUpArrow" */ val curvedUpArrow: typings.officeJs.PowerPoint.GeometricShapeType.curvedUpArrow & String = js.native
    
    /* "Decagon" */ val decagon: typings.officeJs.PowerPoint.GeometricShapeType.decagon & String = js.native
    
    /* "DiagonalStripe" */ val diagonalStripe: typings.officeJs.PowerPoint.GeometricShapeType.diagonalStripe & String = js.native
    
    /* "Diamond" */ val diamond: typings.officeJs.PowerPoint.GeometricShapeType.diamond & String = js.native
    
    /* "Dodecagon" */ val dodecagon: typings.officeJs.PowerPoint.GeometricShapeType.dodecagon & String = js.native
    
    /* "Donut" */ val donut: typings.officeJs.PowerPoint.GeometricShapeType.donut & String = js.native
    
    /* "DoubleWave" */ val doubleWave: typings.officeJs.PowerPoint.GeometricShapeType.doubleWave & String = js.native
    
    /* "DownArrow" */ val downArrow: typings.officeJs.PowerPoint.GeometricShapeType.downArrow & String = js.native
    
    /* "DownArrowCallout" */ val downArrowCallout: typings.officeJs.PowerPoint.GeometricShapeType.downArrowCallout & String = js.native
    
    /* "Ellipse" */ val ellipse: typings.officeJs.PowerPoint.GeometricShapeType.ellipse & String = js.native
    
    /* "EllipseRibbon" */ val ellipseRibbon: typings.officeJs.PowerPoint.GeometricShapeType.ellipseRibbon & String = js.native
    
    /* "EllipseRibbon2" */ val ellipseRibbon2: typings.officeJs.PowerPoint.GeometricShapeType.ellipseRibbon2 & String = js.native
    
    /* "FlowChartAlternateProcess" */ val flowChartAlternateProcess: typings.officeJs.PowerPoint.GeometricShapeType.flowChartAlternateProcess & String = js.native
    
    /* "FlowChartCollate" */ val flowChartCollate: typings.officeJs.PowerPoint.GeometricShapeType.flowChartCollate & String = js.native
    
    /* "FlowChartConnector" */ val flowChartConnector: typings.officeJs.PowerPoint.GeometricShapeType.flowChartConnector & String = js.native
    
    /* "FlowChartDecision" */ val flowChartDecision: typings.officeJs.PowerPoint.GeometricShapeType.flowChartDecision & String = js.native
    
    /* "FlowChartDelay" */ val flowChartDelay: typings.officeJs.PowerPoint.GeometricShapeType.flowChartDelay & String = js.native
    
    /* "FlowChartDisplay" */ val flowChartDisplay: typings.officeJs.PowerPoint.GeometricShapeType.flowChartDisplay & String = js.native
    
    /* "FlowChartDocument" */ val flowChartDocument: typings.officeJs.PowerPoint.GeometricShapeType.flowChartDocument & String = js.native
    
    /* "FlowChartExtract" */ val flowChartExtract: typings.officeJs.PowerPoint.GeometricShapeType.flowChartExtract & String = js.native
    
    /* "FlowChartInputOutput" */ val flowChartInputOutput: typings.officeJs.PowerPoint.GeometricShapeType.flowChartInputOutput & String = js.native
    
    /* "FlowChartInternalStorage" */ val flowChartInternalStorage: typings.officeJs.PowerPoint.GeometricShapeType.flowChartInternalStorage & String = js.native
    
    /* "FlowChartMagneticDisk" */ val flowChartMagneticDisk: typings.officeJs.PowerPoint.GeometricShapeType.flowChartMagneticDisk & String = js.native
    
    /* "FlowChartMagneticDrum" */ val flowChartMagneticDrum: typings.officeJs.PowerPoint.GeometricShapeType.flowChartMagneticDrum & String = js.native
    
    /* "FlowChartMagneticTape" */ val flowChartMagneticTape: typings.officeJs.PowerPoint.GeometricShapeType.flowChartMagneticTape & String = js.native
    
    /* "FlowChartManualInput" */ val flowChartManualInput: typings.officeJs.PowerPoint.GeometricShapeType.flowChartManualInput & String = js.native
    
    /* "FlowChartManualOperation" */ val flowChartManualOperation: typings.officeJs.PowerPoint.GeometricShapeType.flowChartManualOperation & String = js.native
    
    /* "FlowChartMerge" */ val flowChartMerge: typings.officeJs.PowerPoint.GeometricShapeType.flowChartMerge & String = js.native
    
    /* "FlowChartMultidocument" */ val flowChartMultidocument: typings.officeJs.PowerPoint.GeometricShapeType.flowChartMultidocument & String = js.native
    
    /* "FlowChartOfflineStorage" */ val flowChartOfflineStorage: typings.officeJs.PowerPoint.GeometricShapeType.flowChartOfflineStorage & String = js.native
    
    /* "FlowChartOffpageConnector" */ val flowChartOffpageConnector: typings.officeJs.PowerPoint.GeometricShapeType.flowChartOffpageConnector & String = js.native
    
    /* "FlowChartOnlineStorage" */ val flowChartOnlineStorage: typings.officeJs.PowerPoint.GeometricShapeType.flowChartOnlineStorage & String = js.native
    
    /* "FlowChartOr" */ val flowChartOr: typings.officeJs.PowerPoint.GeometricShapeType.flowChartOr & String = js.native
    
    /* "FlowChartPredefinedProcess" */ val flowChartPredefinedProcess: typings.officeJs.PowerPoint.GeometricShapeType.flowChartPredefinedProcess & String = js.native
    
    /* "FlowChartPreparation" */ val flowChartPreparation: typings.officeJs.PowerPoint.GeometricShapeType.flowChartPreparation & String = js.native
    
    /* "FlowChartProcess" */ val flowChartProcess: typings.officeJs.PowerPoint.GeometricShapeType.flowChartProcess & String = js.native
    
    /* "FlowChartPunchedCard" */ val flowChartPunchedCard: typings.officeJs.PowerPoint.GeometricShapeType.flowChartPunchedCard & String = js.native
    
    /* "FlowChartPunchedTape" */ val flowChartPunchedTape: typings.officeJs.PowerPoint.GeometricShapeType.flowChartPunchedTape & String = js.native
    
    /* "FlowChartSort" */ val flowChartSort: typings.officeJs.PowerPoint.GeometricShapeType.flowChartSort & String = js.native
    
    /* "FlowChartSummingJunction" */ val flowChartSummingJunction: typings.officeJs.PowerPoint.GeometricShapeType.flowChartSummingJunction & String = js.native
    
    /* "FlowChartTerminator" */ val flowChartTerminator: typings.officeJs.PowerPoint.GeometricShapeType.flowChartTerminator & String = js.native
    
    /* "FoldedCorner" */ val foldedCorner: typings.officeJs.PowerPoint.GeometricShapeType.foldedCorner & String = js.native
    
    /* "Frame" */ val frame: typings.officeJs.PowerPoint.GeometricShapeType.frame & String = js.native
    
    /* "Funnel" */ val funnel: typings.officeJs.PowerPoint.GeometricShapeType.funnel & String = js.native
    
    /* "Gear6" */ val gear6: typings.officeJs.PowerPoint.GeometricShapeType.gear6 & String = js.native
    
    /* "Gear9" */ val gear9: typings.officeJs.PowerPoint.GeometricShapeType.gear9 & String = js.native
    
    /* "HalfFrame" */ val halfFrame: typings.officeJs.PowerPoint.GeometricShapeType.halfFrame & String = js.native
    
    /* "Heart" */ val heart: typings.officeJs.PowerPoint.GeometricShapeType.heart & String = js.native
    
    /* "Heptagon" */ val heptagon: typings.officeJs.PowerPoint.GeometricShapeType.heptagon & String = js.native
    
    /* "Hexagon" */ val hexagon: typings.officeJs.PowerPoint.GeometricShapeType.hexagon & String = js.native
    
    /* "HomePlate" */ val homePlate: typings.officeJs.PowerPoint.GeometricShapeType.homePlate & String = js.native
    
    /* "HorizontalScroll" */ val horizontalScroll: typings.officeJs.PowerPoint.GeometricShapeType.horizontalScroll & String = js.native
    
    /* "IrregularSeal1" */ val irregularSeal1: typings.officeJs.PowerPoint.GeometricShapeType.irregularSeal1 & String = js.native
    
    /* "IrregularSeal2" */ val irregularSeal2: typings.officeJs.PowerPoint.GeometricShapeType.irregularSeal2 & String = js.native
    
    /* "LeftArrow" */ val leftArrow: typings.officeJs.PowerPoint.GeometricShapeType.leftArrow & String = js.native
    
    /* "LeftArrowCallout" */ val leftArrowCallout: typings.officeJs.PowerPoint.GeometricShapeType.leftArrowCallout & String = js.native
    
    /* "LeftBrace" */ val leftBrace: typings.officeJs.PowerPoint.GeometricShapeType.leftBrace & String = js.native
    
    /* "LeftBracket" */ val leftBracket: typings.officeJs.PowerPoint.GeometricShapeType.leftBracket & String = js.native
    
    /* "LeftCircularArrow" */ val leftCircularArrow: typings.officeJs.PowerPoint.GeometricShapeType.leftCircularArrow & String = js.native
    
    /* "LeftRightArrow" */ val leftRightArrow: typings.officeJs.PowerPoint.GeometricShapeType.leftRightArrow & String = js.native
    
    /* "LeftRightArrowCallout" */ val leftRightArrowCallout: typings.officeJs.PowerPoint.GeometricShapeType.leftRightArrowCallout & String = js.native
    
    /* "LeftRightCircularArrow" */ val leftRightCircularArrow: typings.officeJs.PowerPoint.GeometricShapeType.leftRightCircularArrow & String = js.native
    
    /* "LeftRightRibbon" */ val leftRightRibbon: typings.officeJs.PowerPoint.GeometricShapeType.leftRightRibbon & String = js.native
    
    /* "LeftRightUpArrow" */ val leftRightUpArrow: typings.officeJs.PowerPoint.GeometricShapeType.leftRightUpArrow & String = js.native
    
    /* "LeftUpArrow" */ val leftUpArrow: typings.officeJs.PowerPoint.GeometricShapeType.leftUpArrow & String = js.native
    
    /* "LightningBolt" */ val lightningBolt: typings.officeJs.PowerPoint.GeometricShapeType.lightningBolt & String = js.native
    
    /* "LineInverse" */ val lineInverse: typings.officeJs.PowerPoint.GeometricShapeType.lineInverse & String = js.native
    
    /* "MathDivide" */ val mathDivide: typings.officeJs.PowerPoint.GeometricShapeType.mathDivide & String = js.native
    
    /* "MathEqual" */ val mathEqual: typings.officeJs.PowerPoint.GeometricShapeType.mathEqual & String = js.native
    
    /* "MathMinus" */ val mathMinus: typings.officeJs.PowerPoint.GeometricShapeType.mathMinus & String = js.native
    
    /* "MathMultiply" */ val mathMultiply: typings.officeJs.PowerPoint.GeometricShapeType.mathMultiply & String = js.native
    
    /* "MathNotEqual" */ val mathNotEqual: typings.officeJs.PowerPoint.GeometricShapeType.mathNotEqual & String = js.native
    
    /* "MathPlus" */ val mathPlus: typings.officeJs.PowerPoint.GeometricShapeType.mathPlus & String = js.native
    
    /* "Moon" */ val moon: typings.officeJs.PowerPoint.GeometricShapeType.moon & String = js.native
    
    /* "NoSmoking" */ val noSmoking: typings.officeJs.PowerPoint.GeometricShapeType.noSmoking & String = js.native
    
    /* "NonIsoscelesTrapezoid" */ val nonIsoscelesTrapezoid: typings.officeJs.PowerPoint.GeometricShapeType.nonIsoscelesTrapezoid & String = js.native
    
    /* "NotchedRightArrow" */ val notchedRightArrow: typings.officeJs.PowerPoint.GeometricShapeType.notchedRightArrow & String = js.native
    
    /* "Octagon" */ val octagon: typings.officeJs.PowerPoint.GeometricShapeType.octagon & String = js.native
    
    /* "Parallelogram" */ val parallelogram: typings.officeJs.PowerPoint.GeometricShapeType.parallelogram & String = js.native
    
    /* "Pentagon" */ val pentagon: typings.officeJs.PowerPoint.GeometricShapeType.pentagon & String = js.native
    
    /* "Pie" */ val pie: typings.officeJs.PowerPoint.GeometricShapeType.pie & String = js.native
    
    /* "PieWedge" */ val pieWedge: typings.officeJs.PowerPoint.GeometricShapeType.pieWedge & String = js.native
    
    /* "Plaque" */ val plaque: typings.officeJs.PowerPoint.GeometricShapeType.plaque & String = js.native
    
    /* "PlaqueTabs" */ val plaqueTabs: typings.officeJs.PowerPoint.GeometricShapeType.plaqueTabs & String = js.native
    
    /* "Plus" */ val plus: typings.officeJs.PowerPoint.GeometricShapeType.plus & String = js.native
    
    /* "QuadArrow" */ val quadArrow: typings.officeJs.PowerPoint.GeometricShapeType.quadArrow & String = js.native
    
    /* "QuadArrowCallout" */ val quadArrowCallout: typings.officeJs.PowerPoint.GeometricShapeType.quadArrowCallout & String = js.native
    
    /* "Rectangle" */ val rectangle: typings.officeJs.PowerPoint.GeometricShapeType.rectangle & String = js.native
    
    /* "Ribbon" */ val ribbon: typings.officeJs.PowerPoint.GeometricShapeType.ribbon & String = js.native
    
    /* "Ribbon2" */ val ribbon2: typings.officeJs.PowerPoint.GeometricShapeType.ribbon2 & String = js.native
    
    /* "RightArrow" */ val rightArrow: typings.officeJs.PowerPoint.GeometricShapeType.rightArrow & String = js.native
    
    /* "RightArrowCallout" */ val rightArrowCallout: typings.officeJs.PowerPoint.GeometricShapeType.rightArrowCallout & String = js.native
    
    /* "RightBrace" */ val rightBrace: typings.officeJs.PowerPoint.GeometricShapeType.rightBrace & String = js.native
    
    /* "RightBracket" */ val rightBracket: typings.officeJs.PowerPoint.GeometricShapeType.rightBracket & String = js.native
    
    /* "RightTriangle" */ val rightTriangle: typings.officeJs.PowerPoint.GeometricShapeType.rightTriangle & String = js.native
    
    /* "Round1Rectangle" */ val round1Rectangle: typings.officeJs.PowerPoint.GeometricShapeType.round1Rectangle & String = js.native
    
    /* "Round2DiagonalRectangle" */ val round2DiagonalRectangle: typings.officeJs.PowerPoint.GeometricShapeType.round2DiagonalRectangle & String = js.native
    
    /* "Round2SameRectangle" */ val round2SameRectangle: typings.officeJs.PowerPoint.GeometricShapeType.round2SameRectangle & String = js.native
    
    /* "RoundRectangle" */ val roundRectangle: typings.officeJs.PowerPoint.GeometricShapeType.roundRectangle & String = js.native
    
    /* "SmileyFace" */ val smileyFace: typings.officeJs.PowerPoint.GeometricShapeType.smileyFace & String = js.native
    
    /* "Snip1Rectangle" */ val snip1Rectangle: typings.officeJs.PowerPoint.GeometricShapeType.snip1Rectangle & String = js.native
    
    /* "Snip2DiagonalRectangle" */ val snip2DiagonalRectangle: typings.officeJs.PowerPoint.GeometricShapeType.snip2DiagonalRectangle & String = js.native
    
    /* "Snip2SameRectangle" */ val snip2SameRectangle: typings.officeJs.PowerPoint.GeometricShapeType.snip2SameRectangle & String = js.native
    
    /* "SnipRoundRectangle" */ val snipRoundRectangle: typings.officeJs.PowerPoint.GeometricShapeType.snipRoundRectangle & String = js.native
    
    /* "SquareTabs" */ val squareTabs: typings.officeJs.PowerPoint.GeometricShapeType.squareTabs & String = js.native
    
    /* "Star10" */ val star10: typings.officeJs.PowerPoint.GeometricShapeType.star10 & String = js.native
    
    /* "Star12" */ val star12: typings.officeJs.PowerPoint.GeometricShapeType.star12 & String = js.native
    
    /* "Star16" */ val star16: typings.officeJs.PowerPoint.GeometricShapeType.star16 & String = js.native
    
    /* "Star24" */ val star24: typings.officeJs.PowerPoint.GeometricShapeType.star24 & String = js.native
    
    /* "Star32" */ val star32: typings.officeJs.PowerPoint.GeometricShapeType.star32 & String = js.native
    
    /* "Star4" */ val star4: typings.officeJs.PowerPoint.GeometricShapeType.star4 & String = js.native
    
    /* "Star5" */ val star5: typings.officeJs.PowerPoint.GeometricShapeType.star5 & String = js.native
    
    /* "Star6" */ val star6: typings.officeJs.PowerPoint.GeometricShapeType.star6 & String = js.native
    
    /* "Star7" */ val star7: typings.officeJs.PowerPoint.GeometricShapeType.star7 & String = js.native
    
    /* "Star8" */ val star8: typings.officeJs.PowerPoint.GeometricShapeType.star8 & String = js.native
    
    /* "StripedRightArrow" */ val stripedRightArrow: typings.officeJs.PowerPoint.GeometricShapeType.stripedRightArrow & String = js.native
    
    /* "Sun" */ val sun: typings.officeJs.PowerPoint.GeometricShapeType.sun & String = js.native
    
    /* "SwooshArrow" */ val swooshArrow: typings.officeJs.PowerPoint.GeometricShapeType.swooshArrow & String = js.native
    
    /* "Teardrop" */ val teardrop: typings.officeJs.PowerPoint.GeometricShapeType.teardrop & String = js.native
    
    /* "Trapezoid" */ val trapezoid: typings.officeJs.PowerPoint.GeometricShapeType.trapezoid & String = js.native
    
    /* "Triangle" */ val triangle: typings.officeJs.PowerPoint.GeometricShapeType.triangle & String = js.native
    
    /* "UpArrow" */ val upArrow: typings.officeJs.PowerPoint.GeometricShapeType.upArrow & String = js.native
    
    /* "UpArrowCallout" */ val upArrowCallout: typings.officeJs.PowerPoint.GeometricShapeType.upArrowCallout & String = js.native
    
    /* "UpDownArrow" */ val upDownArrow: typings.officeJs.PowerPoint.GeometricShapeType.upDownArrow & String = js.native
    
    /* "UpDownArrowCallout" */ val upDownArrowCallout: typings.officeJs.PowerPoint.GeometricShapeType.upDownArrowCallout & String = js.native
    
    /* "UturnArrow" */ val uturnArrow: typings.officeJs.PowerPoint.GeometricShapeType.uturnArrow & String = js.native
    
    /* "VerticalScroll" */ val verticalScroll: typings.officeJs.PowerPoint.GeometricShapeType.verticalScroll & String = js.native
    
    /* "Wave" */ val wave: typings.officeJs.PowerPoint.GeometricShapeType.wave & String = js.native
    
    /* "WedgeEllipseCallout" */ val wedgeEllipseCallout: typings.officeJs.PowerPoint.GeometricShapeType.wedgeEllipseCallout & String = js.native
    
    /* "WedgeRRectCallout" */ val wedgeRRectCallout: typings.officeJs.PowerPoint.GeometricShapeType.wedgeRRectCallout & String = js.native
    
    /* "WedgeRectCallout" */ val wedgeRectCallout: typings.officeJs.PowerPoint.GeometricShapeType.wedgeRectCallout & String = js.native
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
    def apply(value: String): js.UndefOr[typings.officeJs.PowerPoint.InsertSlideFormatting & String] = js.native
    
    /* "KeepSourceFormatting" */ val keepSourceFormatting: typings.officeJs.PowerPoint.InsertSlideFormatting.keepSourceFormatting & String = js.native
    
    /* "UseDestinationTheme" */ val useDestinationTheme: typings.officeJs.PowerPoint.InsertSlideFormatting.useDestinationTheme & String = js.native
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
       with typings.officeJs.PowerPoint.ParagraphFormat {
    
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
    def apply(value: String): js.UndefOr[typings.officeJs.PowerPoint.ParagraphHorizontalAlignment & String] = js.native
    
    /* "Center" */ val center: typings.officeJs.PowerPoint.ParagraphHorizontalAlignment.center & String = js.native
    
    /* "Distributed" */ val distributed: typings.officeJs.PowerPoint.ParagraphHorizontalAlignment.distributed & String = js.native
    
    /* "Justify" */ val justify: typings.officeJs.PowerPoint.ParagraphHorizontalAlignment.justify & String = js.native
    
    /* "JustifyLow" */ val justifyLow: typings.officeJs.PowerPoint.ParagraphHorizontalAlignment.justifyLow & String = js.native
    
    /* "Left" */ val left: typings.officeJs.PowerPoint.ParagraphHorizontalAlignment.left & String = js.native
    
    /* "Right" */ val right: typings.officeJs.PowerPoint.ParagraphHorizontalAlignment.right & String = js.native
    
    /* "ThaiDistributed" */ val thaiDistributed: typings.officeJs.PowerPoint.ParagraphHorizontalAlignment.thaiDistributed & String = js.native
  }
  
  /**
    * @remarks
    * [Api set: PowerPointApi 1.0]
    */
  @JSGlobal("PowerPoint.Presentation")
  @js.native
  open class Presentation ()
    extends StObject
       with typings.officeJs.PowerPoint.Presentation {
    
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
       with typings.officeJs.PowerPoint.RequestContext {
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
       with typings.officeJs.PowerPoint.Shape {
    
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
    def apply(value: String): js.UndefOr[typings.officeJs.PowerPoint.ShapeAutoSize & String] = js.native
    
    /* "AutoSizeMixed" */ val autoSizeMixed: typings.officeJs.PowerPoint.ShapeAutoSize.autoSizeMixed & String = js.native
    
    /* "AutoSizeNone" */ val autoSizeNone: typings.officeJs.PowerPoint.ShapeAutoSize.autoSizeNone & String = js.native
    
    /* "AutoSizeShapeToFitText" */ val autoSizeShapeToFitText: typings.officeJs.PowerPoint.ShapeAutoSize.autoSizeShapeToFitText & String = js.native
    
    /* "AutoSizeTextToFitShape" */ val autoSizeTextToFitShape: typings.officeJs.PowerPoint.ShapeAutoSize.autoSizeTextToFitShape & String = js.native
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
       with typings.officeJs.PowerPoint.ShapeCollection {
    
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
       with typings.officeJs.PowerPoint.ShapeFill {
    
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
    def apply(value: String): js.UndefOr[typings.officeJs.PowerPoint.ShapeFillType & String] = js.native
    
    /* "Gradient" */ val gradient: typings.officeJs.PowerPoint.ShapeFillType.gradient & String = js.native
    
    /* "NoFill" */ val noFill: typings.officeJs.PowerPoint.ShapeFillType.noFill & String = js.native
    
    /* "Pattern" */ val pattern: typings.officeJs.PowerPoint.ShapeFillType.pattern & String = js.native
    
    /* "PictureAndTexture" */ val pictureAndTexture: typings.officeJs.PowerPoint.ShapeFillType.pictureAndTexture & String = js.native
    
    /* "SlideBackground" */ val slideBackground: typings.officeJs.PowerPoint.ShapeFillType.slideBackground & String = js.native
    
    /* "Solid" */ val solid: typings.officeJs.PowerPoint.ShapeFillType.solid & String = js.native
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
       with typings.officeJs.PowerPoint.ShapeFont {
    
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
    def apply(value: String): js.UndefOr[typings.officeJs.PowerPoint.ShapeFontUnderlineStyle & String] = js.native
    
    /* "Dash" */ val dash: typings.officeJs.PowerPoint.ShapeFontUnderlineStyle.dash & String = js.native
    
    /* "DashHeavy" */ val dashHeavy: typings.officeJs.PowerPoint.ShapeFontUnderlineStyle.dashHeavy & String = js.native
    
    /* "DashLong" */ val dashLong: typings.officeJs.PowerPoint.ShapeFontUnderlineStyle.dashLong & String = js.native
    
    /* "DashLongHeavy" */ val dashLongHeavy: typings.officeJs.PowerPoint.ShapeFontUnderlineStyle.dashLongHeavy & String = js.native
    
    /* "DotDash" */ val dotDash: typings.officeJs.PowerPoint.ShapeFontUnderlineStyle.dotDash & String = js.native
    
    /* "DotDashHeavy" */ val dotDashHeavy: typings.officeJs.PowerPoint.ShapeFontUnderlineStyle.dotDashHeavy & String = js.native
    
    /* "DotDotDash" */ val dotDotDash: typings.officeJs.PowerPoint.ShapeFontUnderlineStyle.dotDotDash & String = js.native
    
    /* "DotDotDashHeavy" */ val dotDotDashHeavy: typings.officeJs.PowerPoint.ShapeFontUnderlineStyle.dotDotDashHeavy & String = js.native
    
    /* "Dotted" */ val dotted: typings.officeJs.PowerPoint.ShapeFontUnderlineStyle.dotted & String = js.native
    
    /* "DottedHeavy" */ val dottedHeavy: typings.officeJs.PowerPoint.ShapeFontUnderlineStyle.dottedHeavy & String = js.native
    
    /* "Double" */ val double: typings.officeJs.PowerPoint.ShapeFontUnderlineStyle.double & String = js.native
    
    /* "Heavy" */ val heavy: typings.officeJs.PowerPoint.ShapeFontUnderlineStyle.heavy & String = js.native
    
    /* "None" */ val none: typings.officeJs.PowerPoint.ShapeFontUnderlineStyle.none & String = js.native
    
    /* "Single" */ val single: typings.officeJs.PowerPoint.ShapeFontUnderlineStyle.single & String = js.native
    
    /* "Wavy" */ val wavy: typings.officeJs.PowerPoint.ShapeFontUnderlineStyle.wavy & String = js.native
    
    /* "WavyDouble" */ val wavyDouble: typings.officeJs.PowerPoint.ShapeFontUnderlineStyle.wavyDouble & String = js.native
    
    /* "WavyHeavy" */ val wavyHeavy: typings.officeJs.PowerPoint.ShapeFontUnderlineStyle.wavyHeavy & String = js.native
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
    def apply(value: String): js.UndefOr[typings.officeJs.PowerPoint.ShapeLineDashStyle & String] = js.native
    
    /* "Dash" */ val dash: typings.officeJs.PowerPoint.ShapeLineDashStyle.dash & String = js.native
    
    /* "DashDot" */ val dashDot: typings.officeJs.PowerPoint.ShapeLineDashStyle.dashDot & String = js.native
    
    /* "DashDotDot" */ val dashDotDot: typings.officeJs.PowerPoint.ShapeLineDashStyle.dashDotDot & String = js.native
    
    /* "LongDash" */ val longDash: typings.officeJs.PowerPoint.ShapeLineDashStyle.longDash & String = js.native
    
    /* "LongDashDot" */ val longDashDot: typings.officeJs.PowerPoint.ShapeLineDashStyle.longDashDot & String = js.native
    
    /* "LongDashDotDot" */ val longDashDotDot: typings.officeJs.PowerPoint.ShapeLineDashStyle.longDashDotDot & String = js.native
    
    /* "RoundDot" */ val roundDot: typings.officeJs.PowerPoint.ShapeLineDashStyle.roundDot & String = js.native
    
    /* "Solid" */ val solid: typings.officeJs.PowerPoint.ShapeLineDashStyle.solid & String = js.native
    
    /* "SquareDot" */ val squareDot: typings.officeJs.PowerPoint.ShapeLineDashStyle.squareDot & String = js.native
    
    /* "SystemDash" */ val systemDash: typings.officeJs.PowerPoint.ShapeLineDashStyle.systemDash & String = js.native
    
    /* "SystemDashDot" */ val systemDashDot: typings.officeJs.PowerPoint.ShapeLineDashStyle.systemDashDot & String = js.native
    
    /* "SystemDot" */ val systemDot: typings.officeJs.PowerPoint.ShapeLineDashStyle.systemDot & String = js.native
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
       with typings.officeJs.PowerPoint.ShapeLineFormat {
    
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
    def apply(value: String): js.UndefOr[typings.officeJs.PowerPoint.ShapeLineStyle & String] = js.native
    
    /* "Single" */ val single: typings.officeJs.PowerPoint.ShapeLineStyle.single & String = js.native
    
    /* "ThickBetweenThin" */ val thickBetweenThin: typings.officeJs.PowerPoint.ShapeLineStyle.thickBetweenThin & String = js.native
    
    /* "ThickThin" */ val thickThin: typings.officeJs.PowerPoint.ShapeLineStyle.thickThin & String = js.native
    
    /* "ThinThick" */ val thinThick: typings.officeJs.PowerPoint.ShapeLineStyle.thinThick & String = js.native
    
    /* "ThinThin" */ val thinThin: typings.officeJs.PowerPoint.ShapeLineStyle.thinThin & String = js.native
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
    def apply(value: String): js.UndefOr[typings.officeJs.PowerPoint.ShapeType & String] = js.native
    
    /* "GeometricShape" */ val geometricShape: typings.officeJs.PowerPoint.ShapeType.geometricShape & String = js.native
    
    /* "Group" */ val group: typings.officeJs.PowerPoint.ShapeType.group & String = js.native
    
    /* "Image" */ val image: typings.officeJs.PowerPoint.ShapeType.image & String = js.native
    
    /* "Line" */ val line: typings.officeJs.PowerPoint.ShapeType.line & String = js.native
    
    /* "Unsupported" */ val unsupported: typings.officeJs.PowerPoint.ShapeType.unsupported & String = js.native
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
       with typings.officeJs.PowerPoint.Slide {
    
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
       with typings.officeJs.PowerPoint.SlideCollection {
    
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
       with typings.officeJs.PowerPoint.SlideLayout {
    
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
       with typings.officeJs.PowerPoint.SlideLayoutCollection {
    
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
       with typings.officeJs.PowerPoint.SlideMaster {
    
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
       with typings.officeJs.PowerPoint.SlideMasterCollection {
    
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
       with typings.officeJs.PowerPoint.Tag {
    
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
       with typings.officeJs.PowerPoint.TagCollection {
    
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
       with typings.officeJs.PowerPoint.TextFrame {
    
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
       with typings.officeJs.PowerPoint.TextRange {
    
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
    def apply(value: String): js.UndefOr[typings.officeJs.PowerPoint.TextVerticalAlignment & String] = js.native
    
    /* "Bottom" */ val bottom: typings.officeJs.PowerPoint.TextVerticalAlignment.bottom & String = js.native
    
    /* "BottomCentered" */ val bottomCentered: typings.officeJs.PowerPoint.TextVerticalAlignment.bottomCentered & String = js.native
    
    /* "Middle" */ val middle: typings.officeJs.PowerPoint.TextVerticalAlignment.middle & String = js.native
    
    /* "MiddleCentered" */ val middleCentered: typings.officeJs.PowerPoint.TextVerticalAlignment.middleCentered & String = js.native
    
    /* "Top" */ val top: typings.officeJs.PowerPoint.TextVerticalAlignment.top & String = js.native
    
    /* "TopCentered" */ val topCentered: typings.officeJs.PowerPoint.TextVerticalAlignment.topCentered & String = js.native
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
  inline def run[T](batch: js.Function1[/* context */ typings.officeJs.PowerPoint.RequestContext, js.Promise[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(batch.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  /**
    * Executes a batch script that performs actions on the PowerPoint object model, using the RequestContext of previously-created API objects.
    * @param objects - An array of previously-created API objects. The array will be validated to make sure that all of the objects share the same context. The batch will use this shared RequestContext, which means that any changes applied to these objects will be picked up by "context.sync()".
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the PowerPoint application. Since the Office add-in and the PowerPoint application run in two different processes, the RequestContext is required to get access to the PowerPoint object model from the add-in.
    */
  inline def run[T](
    objects: js.Array[ClientObject],
    batch: js.Function1[/* context */ typings.officeJs.PowerPoint.RequestContext, js.Promise[T]]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(objects.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  /**
    * Executes a batch script that performs actions on the PowerPoint object model, using the RequestContext of a previously-created API object. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    * @param object - A previously-created API object. The batch will use the same RequestContext as the passed-in object, which means that any changes applied to the object will be picked up by "context.sync()".
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the PowerPoint application. Since the Office add-in and the PowerPoint application run in two different processes, the RequestContext is required to get access to the PowerPoint object model from the add-in.
    */
  inline def run[T](
    `object`: ClientObject,
    batch: js.Function1[/* context */ typings.officeJs.PowerPoint.RequestContext, js.Promise[T]]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(`object`.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
