package typings.mermaid

import org.scalablytyped.runtime.Shortcut
import typings.mermaid.mermaidStrings.BT
import typings.mermaid.mermaidStrings.LR
import typings.mermaid.mermaidStrings.RL
import typings.mermaid.mermaidStrings.TB
import typings.mermaid.mermaidStrings.`dagre-d3`
import typings.mermaid.mermaidStrings.`dagre-wrapper`
import typings.mermaid.mermaidStrings.`null`
import typings.mermaid.mermaidStrings.antiscript
import typings.mermaid.mermaidStrings.arrowMarkerAbsolute
import typings.mermaid.mermaidStrings.basis
import typings.mermaid.mermaidStrings.c4
import typings.mermaid.mermaidStrings.cardinal
import typings.mermaid.mermaidStrings.center
import typings.mermaid.mermaidStrings.dark
import typings.mermaid.mermaidStrings.debug
import typings.mermaid.mermaidStrings.deterministicIDSeed
import typings.mermaid.mermaidStrings.deterministicIds
import typings.mermaid.mermaidStrings.er
import typings.mermaid.mermaidStrings.error
import typings.mermaid.mermaidStrings.fatal
import typings.mermaid.mermaidStrings.flowchart
import typings.mermaid.mermaidStrings.fontFamily
import typings.mermaid.mermaidStrings.forest
import typings.mermaid.mermaidStrings.gantt
import typings.mermaid.mermaidStrings.info
import typings.mermaid.mermaidStrings.journey
import typings.mermaid.mermaidStrings.left
import typings.mermaid.mermaidStrings.linear
import typings.mermaid.mermaidStrings.logLevel
import typings.mermaid.mermaidStrings.loose
import typings.mermaid.mermaidStrings.neutral
import typings.mermaid.mermaidStrings.pie
import typings.mermaid.mermaidStrings.requirement
import typings.mermaid.mermaidStrings.right
import typings.mermaid.mermaidStrings.sandbox
import typings.mermaid.mermaidStrings.secure
import typings.mermaid.mermaidStrings.securityLevel
import typings.mermaid.mermaidStrings.sequence
import typings.mermaid.mermaidStrings.startOnLoad
import typings.mermaid.mermaidStrings.strict
import typings.mermaid.mermaidStrings.theme
import typings.mermaid.mermaidStrings.warn
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("mermaid", JSImport.Default)
  @js.native
  val default: Mermaid = js.native
  
  trait C4Config extends StObject {
    
    /**
      * This sets the font family of Boundary shape for the diagram
      *
      * @default '"Open Sans", sans-serif'
      */
    var boundaryFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font size of Boundary shape for the diagram
      *
      * @default 14
      */
    var boundaryFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font weight of Boundary shape for the diagram
      *
      * @default 'normal'
      */
    var boundaryFontWeight: js.UndefOr[String] = js.undefined
    
    /**
      * Margin around boxes
      *
      * @default 10
      */
    var boxMargin: js.UndefOr[Double] = js.undefined
    
    /**
      * How many boundarys to place in each row.
      *
      * @default 2
      */
    var c4BoundaryInRow: js.UndefOr[Double] = js.undefined
    
    /**
      * How many shapes to place in each row.
      *
      * @default 4
      */
    var c4ShapeInRow: js.UndefOr[Double] = js.undefined
    
    /**
      * Margin between shapes
      *
      * @default 50
      */
    var c4ShapeMargin: js.UndefOr[Double] = js.undefined
    
    /**
      * Padding between shapes
      *
      * @default 20
      */
    var c4ShapePadding: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font family of Component shape for the diagram
      *
      * @default '"Open Sans", sans-serif'
      */
    var componentFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font size of Component shape for the diagram
      *
      * @default 14
      */
    var componentFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font weight of Component shape for the diagram
      *
      * @default 'normal'
      */
    var componentFontWeight: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font family of Component DB shape for the diagram
      *
      * @default '"Open Sans", sans-serif'
      */
    var component_dbFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font size of Component DB shape for the diagram
      *
      * @default 14
      */
    var component_dbFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font weight of Component DB shape for the diagram
      *
      * @default 'normal'
      */
    var component_dbFontWeight: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font family of Component Queue shape for the diagram
      *
      * @default '"Open Sans", sans-serif'
      */
    var component_queueFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font size of Component Queue shape for the diagram
      *
      * @default 14
      */
    var component_queueFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font weight of Component Queue shape for the diagram
      *
      * @default 'normal'
      */
    var component_queueFontWeight: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font family of Container shape for the diagram
      *
      * @default '"Open Sans", sans-serif'
      */
    var containerFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font size of Container shape for the diagram
      *
      * @default 14
      */
    var containerFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font weight of Container shape for the diagram
      *
      * @default 'normal'
      */
    var containerFontWeight: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font family of Container DB shape for the diagram
      *
      * @default '"Open Sans", sans-serif'
      */
    var container_dbFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font size of Container DB shape for the diagram
      *
      * @default 14
      */
    var container_dbFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font weight of Container DB shape for the diagram
      *
      * @default 'normal'
      */
    var container_dbFontWeight: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font family of Container Queue shape for the diagram
      *
      * @default '"Open Sans", sans-serif'
      */
    var container_queueFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font size of Container Queue shape for the diagram
      *
      * @default 14
      */
    var container_queueFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font weight of Container Queue shape for the diagram
      *
      * @default 'normal'
      */
    var container_queueFontWeight: js.UndefOr[String] = js.undefined
    
    /**
      * Margin to the right and left of the c4 diagram
      *
      * @default 50
      */
    var diagramMarginX: js.UndefOr[Double] = js.undefined
    
    /**
      * Margin to the over and under the c4 diagram
      *
      * @default 10
      */
    var diagramMarginY: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font family of External Component shape for the diagram
      *
      * @default '"Open Sans", sans-serif'
      */
    var external_componentFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font size of External Component shape for the diagram
      *
      * @default 14
      */
    var external_componentFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font weight of External Component shape for the diagram
      *
      * @default 'normal'
      */
    var external_componentFontWeight: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font family of External Component DB shape for the diagram
      *
      * @default '"Open Sans", sans-serif'
      */
    var external_component_dbFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font size of External Component DB shape for the diagram
      *
      * @default 14
      */
    var external_component_dbFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font weight of External Component DB shape for the diagram
      *
      * @default 'normal'
      */
    var external_component_dbFontWeight: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font family of External Component Queue shape for the diagram
      *
      * @default '"Open Sans", sans-serif'
      */
    var external_component_queueFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font size of External Component Queue shape for the diagram
      *
      * @default 14
      */
    var external_component_queueFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font weight of External Component Queue shape for the diagram
      *
      * @default 'normal'
      */
    var external_component_queueFontWeight: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font family of External Container shape for the diagram
      *
      * @default '"Open Sans", sans-serif'
      */
    var external_containerFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font size of External Container shape for the diagram
      *
      * @default 14
      */
    var external_containerFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font weight of External Container shape for the diagram
      *
      * @default 'normal'
      */
    var external_containerFontWeight: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font family of External Container DB shape for the diagram
      *
      * @default '"Open Sans", sans-serif'
      */
    var external_container_dbFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font size of External Container DB shape for the diagram
      *
      * @default 14
      */
    var external_container_dbFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font weight of External Container DB shape for the diagram
      *
      * @default 'normal'
      */
    var external_container_dbFontWeight: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font family of External Container Queue shape for the diagram
      *
      * @default '"Open Sans", sans-serif'
      */
    var external_container_queueFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font size of External Container Queue shape for the diagram
      *
      * @default 14
      */
    var external_container_queueFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font weight of External Container Queue shape for the diagram
      *
      * @default 'normal'
      */
    var external_container_queueFontWeight: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font family of External Person shape for the diagram
      *
      * @default '"Open Sans", sans-serif'
      */
    var external_personFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font size of External Person shape for the diagram
      *
      * @default 14
      */
    var external_personFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font weight of External Person shape for the diagram
      *
      * @default 'normal'
      */
    var external_personFontWeight: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font family of External System shape for the diagram
      *
      * @default '"Open Sans", sans-serif'
      */
    var external_systemFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font size of External System shape for the diagram
      *
      * @default 14
      */
    var external_systemFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font weight of External System shape for the diagram
      *
      * @default 'normal'
      */
    var external_systemFontWeight: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font family of External System DB shape for the diagram
      *
      * @default '"Open Sans", sans-serif'
      */
    var external_system_dbFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font size of External System DB shape for the diagram
      *
      * @default 14
      */
    var external_system_dbFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font weight of External System DB shape for the diagram
      *
      * @default 'normal'
      */
    var external_system_dbFontWeight: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font family of External System Queue shape for the diagram
      *
      * @default '"Open Sans", sans-serif'
      */
    var external_system_queueFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font size of External System Queue shape for the diagram
      *
      * @default 14
      */
    var external_system_queueFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font weight of External System Queue shape for the diagram
      *
      * @default 'normal'
      */
    var external_system_queueFontWeight: js.UndefOr[String] = js.undefined
    
    /**
      * Height of person boxes
      *
      * @default 60
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font family of Message shape for the diagram
      *
      * @default '"Open Sans", sans-serif'
      */
    var messageFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font size of Message shape for the diagram
      *
      * @default 12
      */
    var messageFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font weight of Message shape for the diagram
      *
      * @default 'normal'
      */
    var messageFontWeight: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font family of Person shape for the diagram
      *
      * @default '"Open Sans", sans-serif'
      */
    var personFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font size of Person shape for the diagram
      *
      * @default 14
      */
    var personFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font weight of Person shape for the diagram
      *
      * @default 'normal'
      */
    var personFontWeight: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font family of System shape for the diagram
      *
      * @default '"Open Sans", sans-serif'
      */
    var systemFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font size of System shape for the diagram
      *
      * @default 14
      */
    var systemFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font weight of System shape for the diagram
      *
      * @default 'normal'
      */
    var systemFontWeight: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font family of System DB shape for the diagram
      *
      * @default '"Open Sans", sans-serif'
      */
    var system_dbFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font size of System DB shape for the diagram
      *
      * @default 14
      */
    var system_dbFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font weight of System DB shape for the diagram
      *
      * @default 'normal'
      */
    var system_dbFontWeight: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font family of System Queue shape for the diagram
      *
      * @default '"Open Sans", sans-serif'
      */
    var system_queueFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font size of System Queue shape for the diagram
      *
      * @default 14
      */
    var system_queueFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font weight of System Queue shape for the diagram
      *
      * @default 'normal'
      */
    var system_queueFontWeight: js.UndefOr[String] = js.undefined
    
    /**
      * When this flag is set to true, the height and width is set to 100% and is then scaling with the available space. If set to false, the absolute space required is used.
      *
      * @default true
      */
    var useMaxWidth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Width of person boxes
      *
      * @default 216
      */
    var width: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the auto-wrap state for the diagram
      *
      * @default true
      */
    var wrap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This sets the auto-wrap padding for the diagram (sides only)
      *
      * @default 0
      */
    var wrapPadding: js.UndefOr[Double] = js.undefined
  }
  object C4Config {
    
    inline def apply(): C4Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[C4Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: C4Config] (val x: Self) extends AnyVal {
      
      inline def setBoundaryFontFamily(value: String): Self = StObject.set(x, "boundaryFontFamily", value.asInstanceOf[js.Any])
      
      inline def setBoundaryFontFamilyUndefined: Self = StObject.set(x, "boundaryFontFamily", js.undefined)
      
      inline def setBoundaryFontSize(value: Double): Self = StObject.set(x, "boundaryFontSize", value.asInstanceOf[js.Any])
      
      inline def setBoundaryFontSizeUndefined: Self = StObject.set(x, "boundaryFontSize", js.undefined)
      
      inline def setBoundaryFontWeight(value: String): Self = StObject.set(x, "boundaryFontWeight", value.asInstanceOf[js.Any])
      
      inline def setBoundaryFontWeightUndefined: Self = StObject.set(x, "boundaryFontWeight", js.undefined)
      
      inline def setBoxMargin(value: Double): Self = StObject.set(x, "boxMargin", value.asInstanceOf[js.Any])
      
      inline def setBoxMarginUndefined: Self = StObject.set(x, "boxMargin", js.undefined)
      
      inline def setC4BoundaryInRow(value: Double): Self = StObject.set(x, "c4BoundaryInRow", value.asInstanceOf[js.Any])
      
      inline def setC4BoundaryInRowUndefined: Self = StObject.set(x, "c4BoundaryInRow", js.undefined)
      
      inline def setC4ShapeInRow(value: Double): Self = StObject.set(x, "c4ShapeInRow", value.asInstanceOf[js.Any])
      
      inline def setC4ShapeInRowUndefined: Self = StObject.set(x, "c4ShapeInRow", js.undefined)
      
      inline def setC4ShapeMargin(value: Double): Self = StObject.set(x, "c4ShapeMargin", value.asInstanceOf[js.Any])
      
      inline def setC4ShapeMarginUndefined: Self = StObject.set(x, "c4ShapeMargin", js.undefined)
      
      inline def setC4ShapePadding(value: Double): Self = StObject.set(x, "c4ShapePadding", value.asInstanceOf[js.Any])
      
      inline def setC4ShapePaddingUndefined: Self = StObject.set(x, "c4ShapePadding", js.undefined)
      
      inline def setComponentFontFamily(value: String): Self = StObject.set(x, "componentFontFamily", value.asInstanceOf[js.Any])
      
      inline def setComponentFontFamilyUndefined: Self = StObject.set(x, "componentFontFamily", js.undefined)
      
      inline def setComponentFontSize(value: Double): Self = StObject.set(x, "componentFontSize", value.asInstanceOf[js.Any])
      
      inline def setComponentFontSizeUndefined: Self = StObject.set(x, "componentFontSize", js.undefined)
      
      inline def setComponentFontWeight(value: String): Self = StObject.set(x, "componentFontWeight", value.asInstanceOf[js.Any])
      
      inline def setComponentFontWeightUndefined: Self = StObject.set(x, "componentFontWeight", js.undefined)
      
      inline def setComponent_dbFontFamily(value: String): Self = StObject.set(x, "component_dbFontFamily", value.asInstanceOf[js.Any])
      
      inline def setComponent_dbFontFamilyUndefined: Self = StObject.set(x, "component_dbFontFamily", js.undefined)
      
      inline def setComponent_dbFontSize(value: Double): Self = StObject.set(x, "component_dbFontSize", value.asInstanceOf[js.Any])
      
      inline def setComponent_dbFontSizeUndefined: Self = StObject.set(x, "component_dbFontSize", js.undefined)
      
      inline def setComponent_dbFontWeight(value: String): Self = StObject.set(x, "component_dbFontWeight", value.asInstanceOf[js.Any])
      
      inline def setComponent_dbFontWeightUndefined: Self = StObject.set(x, "component_dbFontWeight", js.undefined)
      
      inline def setComponent_queueFontFamily(value: String): Self = StObject.set(x, "component_queueFontFamily", value.asInstanceOf[js.Any])
      
      inline def setComponent_queueFontFamilyUndefined: Self = StObject.set(x, "component_queueFontFamily", js.undefined)
      
      inline def setComponent_queueFontSize(value: Double): Self = StObject.set(x, "component_queueFontSize", value.asInstanceOf[js.Any])
      
      inline def setComponent_queueFontSizeUndefined: Self = StObject.set(x, "component_queueFontSize", js.undefined)
      
      inline def setComponent_queueFontWeight(value: String): Self = StObject.set(x, "component_queueFontWeight", value.asInstanceOf[js.Any])
      
      inline def setComponent_queueFontWeightUndefined: Self = StObject.set(x, "component_queueFontWeight", js.undefined)
      
      inline def setContainerFontFamily(value: String): Self = StObject.set(x, "containerFontFamily", value.asInstanceOf[js.Any])
      
      inline def setContainerFontFamilyUndefined: Self = StObject.set(x, "containerFontFamily", js.undefined)
      
      inline def setContainerFontSize(value: Double): Self = StObject.set(x, "containerFontSize", value.asInstanceOf[js.Any])
      
      inline def setContainerFontSizeUndefined: Self = StObject.set(x, "containerFontSize", js.undefined)
      
      inline def setContainerFontWeight(value: String): Self = StObject.set(x, "containerFontWeight", value.asInstanceOf[js.Any])
      
      inline def setContainerFontWeightUndefined: Self = StObject.set(x, "containerFontWeight", js.undefined)
      
      inline def setContainer_dbFontFamily(value: String): Self = StObject.set(x, "container_dbFontFamily", value.asInstanceOf[js.Any])
      
      inline def setContainer_dbFontFamilyUndefined: Self = StObject.set(x, "container_dbFontFamily", js.undefined)
      
      inline def setContainer_dbFontSize(value: Double): Self = StObject.set(x, "container_dbFontSize", value.asInstanceOf[js.Any])
      
      inline def setContainer_dbFontSizeUndefined: Self = StObject.set(x, "container_dbFontSize", js.undefined)
      
      inline def setContainer_dbFontWeight(value: String): Self = StObject.set(x, "container_dbFontWeight", value.asInstanceOf[js.Any])
      
      inline def setContainer_dbFontWeightUndefined: Self = StObject.set(x, "container_dbFontWeight", js.undefined)
      
      inline def setContainer_queueFontFamily(value: String): Self = StObject.set(x, "container_queueFontFamily", value.asInstanceOf[js.Any])
      
      inline def setContainer_queueFontFamilyUndefined: Self = StObject.set(x, "container_queueFontFamily", js.undefined)
      
      inline def setContainer_queueFontSize(value: Double): Self = StObject.set(x, "container_queueFontSize", value.asInstanceOf[js.Any])
      
      inline def setContainer_queueFontSizeUndefined: Self = StObject.set(x, "container_queueFontSize", js.undefined)
      
      inline def setContainer_queueFontWeight(value: String): Self = StObject.set(x, "container_queueFontWeight", value.asInstanceOf[js.Any])
      
      inline def setContainer_queueFontWeightUndefined: Self = StObject.set(x, "container_queueFontWeight", js.undefined)
      
      inline def setDiagramMarginX(value: Double): Self = StObject.set(x, "diagramMarginX", value.asInstanceOf[js.Any])
      
      inline def setDiagramMarginXUndefined: Self = StObject.set(x, "diagramMarginX", js.undefined)
      
      inline def setDiagramMarginY(value: Double): Self = StObject.set(x, "diagramMarginY", value.asInstanceOf[js.Any])
      
      inline def setDiagramMarginYUndefined: Self = StObject.set(x, "diagramMarginY", js.undefined)
      
      inline def setExternal_componentFontFamily(value: String): Self = StObject.set(x, "external_componentFontFamily", value.asInstanceOf[js.Any])
      
      inline def setExternal_componentFontFamilyUndefined: Self = StObject.set(x, "external_componentFontFamily", js.undefined)
      
      inline def setExternal_componentFontSize(value: Double): Self = StObject.set(x, "external_componentFontSize", value.asInstanceOf[js.Any])
      
      inline def setExternal_componentFontSizeUndefined: Self = StObject.set(x, "external_componentFontSize", js.undefined)
      
      inline def setExternal_componentFontWeight(value: String): Self = StObject.set(x, "external_componentFontWeight", value.asInstanceOf[js.Any])
      
      inline def setExternal_componentFontWeightUndefined: Self = StObject.set(x, "external_componentFontWeight", js.undefined)
      
      inline def setExternal_component_dbFontFamily(value: String): Self = StObject.set(x, "external_component_dbFontFamily", value.asInstanceOf[js.Any])
      
      inline def setExternal_component_dbFontFamilyUndefined: Self = StObject.set(x, "external_component_dbFontFamily", js.undefined)
      
      inline def setExternal_component_dbFontSize(value: Double): Self = StObject.set(x, "external_component_dbFontSize", value.asInstanceOf[js.Any])
      
      inline def setExternal_component_dbFontSizeUndefined: Self = StObject.set(x, "external_component_dbFontSize", js.undefined)
      
      inline def setExternal_component_dbFontWeight(value: String): Self = StObject.set(x, "external_component_dbFontWeight", value.asInstanceOf[js.Any])
      
      inline def setExternal_component_dbFontWeightUndefined: Self = StObject.set(x, "external_component_dbFontWeight", js.undefined)
      
      inline def setExternal_component_queueFontFamily(value: String): Self = StObject.set(x, "external_component_queueFontFamily", value.asInstanceOf[js.Any])
      
      inline def setExternal_component_queueFontFamilyUndefined: Self = StObject.set(x, "external_component_queueFontFamily", js.undefined)
      
      inline def setExternal_component_queueFontSize(value: Double): Self = StObject.set(x, "external_component_queueFontSize", value.asInstanceOf[js.Any])
      
      inline def setExternal_component_queueFontSizeUndefined: Self = StObject.set(x, "external_component_queueFontSize", js.undefined)
      
      inline def setExternal_component_queueFontWeight(value: String): Self = StObject.set(x, "external_component_queueFontWeight", value.asInstanceOf[js.Any])
      
      inline def setExternal_component_queueFontWeightUndefined: Self = StObject.set(x, "external_component_queueFontWeight", js.undefined)
      
      inline def setExternal_containerFontFamily(value: String): Self = StObject.set(x, "external_containerFontFamily", value.asInstanceOf[js.Any])
      
      inline def setExternal_containerFontFamilyUndefined: Self = StObject.set(x, "external_containerFontFamily", js.undefined)
      
      inline def setExternal_containerFontSize(value: Double): Self = StObject.set(x, "external_containerFontSize", value.asInstanceOf[js.Any])
      
      inline def setExternal_containerFontSizeUndefined: Self = StObject.set(x, "external_containerFontSize", js.undefined)
      
      inline def setExternal_containerFontWeight(value: String): Self = StObject.set(x, "external_containerFontWeight", value.asInstanceOf[js.Any])
      
      inline def setExternal_containerFontWeightUndefined: Self = StObject.set(x, "external_containerFontWeight", js.undefined)
      
      inline def setExternal_container_dbFontFamily(value: String): Self = StObject.set(x, "external_container_dbFontFamily", value.asInstanceOf[js.Any])
      
      inline def setExternal_container_dbFontFamilyUndefined: Self = StObject.set(x, "external_container_dbFontFamily", js.undefined)
      
      inline def setExternal_container_dbFontSize(value: Double): Self = StObject.set(x, "external_container_dbFontSize", value.asInstanceOf[js.Any])
      
      inline def setExternal_container_dbFontSizeUndefined: Self = StObject.set(x, "external_container_dbFontSize", js.undefined)
      
      inline def setExternal_container_dbFontWeight(value: String): Self = StObject.set(x, "external_container_dbFontWeight", value.asInstanceOf[js.Any])
      
      inline def setExternal_container_dbFontWeightUndefined: Self = StObject.set(x, "external_container_dbFontWeight", js.undefined)
      
      inline def setExternal_container_queueFontFamily(value: String): Self = StObject.set(x, "external_container_queueFontFamily", value.asInstanceOf[js.Any])
      
      inline def setExternal_container_queueFontFamilyUndefined: Self = StObject.set(x, "external_container_queueFontFamily", js.undefined)
      
      inline def setExternal_container_queueFontSize(value: Double): Self = StObject.set(x, "external_container_queueFontSize", value.asInstanceOf[js.Any])
      
      inline def setExternal_container_queueFontSizeUndefined: Self = StObject.set(x, "external_container_queueFontSize", js.undefined)
      
      inline def setExternal_container_queueFontWeight(value: String): Self = StObject.set(x, "external_container_queueFontWeight", value.asInstanceOf[js.Any])
      
      inline def setExternal_container_queueFontWeightUndefined: Self = StObject.set(x, "external_container_queueFontWeight", js.undefined)
      
      inline def setExternal_personFontFamily(value: String): Self = StObject.set(x, "external_personFontFamily", value.asInstanceOf[js.Any])
      
      inline def setExternal_personFontFamilyUndefined: Self = StObject.set(x, "external_personFontFamily", js.undefined)
      
      inline def setExternal_personFontSize(value: Double): Self = StObject.set(x, "external_personFontSize", value.asInstanceOf[js.Any])
      
      inline def setExternal_personFontSizeUndefined: Self = StObject.set(x, "external_personFontSize", js.undefined)
      
      inline def setExternal_personFontWeight(value: String): Self = StObject.set(x, "external_personFontWeight", value.asInstanceOf[js.Any])
      
      inline def setExternal_personFontWeightUndefined: Self = StObject.set(x, "external_personFontWeight", js.undefined)
      
      inline def setExternal_systemFontFamily(value: String): Self = StObject.set(x, "external_systemFontFamily", value.asInstanceOf[js.Any])
      
      inline def setExternal_systemFontFamilyUndefined: Self = StObject.set(x, "external_systemFontFamily", js.undefined)
      
      inline def setExternal_systemFontSize(value: Double): Self = StObject.set(x, "external_systemFontSize", value.asInstanceOf[js.Any])
      
      inline def setExternal_systemFontSizeUndefined: Self = StObject.set(x, "external_systemFontSize", js.undefined)
      
      inline def setExternal_systemFontWeight(value: String): Self = StObject.set(x, "external_systemFontWeight", value.asInstanceOf[js.Any])
      
      inline def setExternal_systemFontWeightUndefined: Self = StObject.set(x, "external_systemFontWeight", js.undefined)
      
      inline def setExternal_system_dbFontFamily(value: String): Self = StObject.set(x, "external_system_dbFontFamily", value.asInstanceOf[js.Any])
      
      inline def setExternal_system_dbFontFamilyUndefined: Self = StObject.set(x, "external_system_dbFontFamily", js.undefined)
      
      inline def setExternal_system_dbFontSize(value: Double): Self = StObject.set(x, "external_system_dbFontSize", value.asInstanceOf[js.Any])
      
      inline def setExternal_system_dbFontSizeUndefined: Self = StObject.set(x, "external_system_dbFontSize", js.undefined)
      
      inline def setExternal_system_dbFontWeight(value: String): Self = StObject.set(x, "external_system_dbFontWeight", value.asInstanceOf[js.Any])
      
      inline def setExternal_system_dbFontWeightUndefined: Self = StObject.set(x, "external_system_dbFontWeight", js.undefined)
      
      inline def setExternal_system_queueFontFamily(value: String): Self = StObject.set(x, "external_system_queueFontFamily", value.asInstanceOf[js.Any])
      
      inline def setExternal_system_queueFontFamilyUndefined: Self = StObject.set(x, "external_system_queueFontFamily", js.undefined)
      
      inline def setExternal_system_queueFontSize(value: Double): Self = StObject.set(x, "external_system_queueFontSize", value.asInstanceOf[js.Any])
      
      inline def setExternal_system_queueFontSizeUndefined: Self = StObject.set(x, "external_system_queueFontSize", js.undefined)
      
      inline def setExternal_system_queueFontWeight(value: String): Self = StObject.set(x, "external_system_queueFontWeight", value.asInstanceOf[js.Any])
      
      inline def setExternal_system_queueFontWeightUndefined: Self = StObject.set(x, "external_system_queueFontWeight", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMessageFontFamily(value: String): Self = StObject.set(x, "messageFontFamily", value.asInstanceOf[js.Any])
      
      inline def setMessageFontFamilyUndefined: Self = StObject.set(x, "messageFontFamily", js.undefined)
      
      inline def setMessageFontSize(value: Double): Self = StObject.set(x, "messageFontSize", value.asInstanceOf[js.Any])
      
      inline def setMessageFontSizeUndefined: Self = StObject.set(x, "messageFontSize", js.undefined)
      
      inline def setMessageFontWeight(value: String): Self = StObject.set(x, "messageFontWeight", value.asInstanceOf[js.Any])
      
      inline def setMessageFontWeightUndefined: Self = StObject.set(x, "messageFontWeight", js.undefined)
      
      inline def setPersonFontFamily(value: String): Self = StObject.set(x, "personFontFamily", value.asInstanceOf[js.Any])
      
      inline def setPersonFontFamilyUndefined: Self = StObject.set(x, "personFontFamily", js.undefined)
      
      inline def setPersonFontSize(value: Double): Self = StObject.set(x, "personFontSize", value.asInstanceOf[js.Any])
      
      inline def setPersonFontSizeUndefined: Self = StObject.set(x, "personFontSize", js.undefined)
      
      inline def setPersonFontWeight(value: String): Self = StObject.set(x, "personFontWeight", value.asInstanceOf[js.Any])
      
      inline def setPersonFontWeightUndefined: Self = StObject.set(x, "personFontWeight", js.undefined)
      
      inline def setSystemFontFamily(value: String): Self = StObject.set(x, "systemFontFamily", value.asInstanceOf[js.Any])
      
      inline def setSystemFontFamilyUndefined: Self = StObject.set(x, "systemFontFamily", js.undefined)
      
      inline def setSystemFontSize(value: Double): Self = StObject.set(x, "systemFontSize", value.asInstanceOf[js.Any])
      
      inline def setSystemFontSizeUndefined: Self = StObject.set(x, "systemFontSize", js.undefined)
      
      inline def setSystemFontWeight(value: String): Self = StObject.set(x, "systemFontWeight", value.asInstanceOf[js.Any])
      
      inline def setSystemFontWeightUndefined: Self = StObject.set(x, "systemFontWeight", js.undefined)
      
      inline def setSystem_dbFontFamily(value: String): Self = StObject.set(x, "system_dbFontFamily", value.asInstanceOf[js.Any])
      
      inline def setSystem_dbFontFamilyUndefined: Self = StObject.set(x, "system_dbFontFamily", js.undefined)
      
      inline def setSystem_dbFontSize(value: Double): Self = StObject.set(x, "system_dbFontSize", value.asInstanceOf[js.Any])
      
      inline def setSystem_dbFontSizeUndefined: Self = StObject.set(x, "system_dbFontSize", js.undefined)
      
      inline def setSystem_dbFontWeight(value: String): Self = StObject.set(x, "system_dbFontWeight", value.asInstanceOf[js.Any])
      
      inline def setSystem_dbFontWeightUndefined: Self = StObject.set(x, "system_dbFontWeight", js.undefined)
      
      inline def setSystem_queueFontFamily(value: String): Self = StObject.set(x, "system_queueFontFamily", value.asInstanceOf[js.Any])
      
      inline def setSystem_queueFontFamilyUndefined: Self = StObject.set(x, "system_queueFontFamily", js.undefined)
      
      inline def setSystem_queueFontSize(value: Double): Self = StObject.set(x, "system_queueFontSize", value.asInstanceOf[js.Any])
      
      inline def setSystem_queueFontSizeUndefined: Self = StObject.set(x, "system_queueFontSize", js.undefined)
      
      inline def setSystem_queueFontWeight(value: String): Self = StObject.set(x, "system_queueFontWeight", value.asInstanceOf[js.Any])
      
      inline def setSystem_queueFontWeightUndefined: Self = StObject.set(x, "system_queueFontWeight", js.undefined)
      
      inline def setUseMaxWidth(value: Boolean): Self = StObject.set(x, "useMaxWidth", value.asInstanceOf[js.Any])
      
      inline def setUseMaxWidthUndefined: Self = StObject.set(x, "useMaxWidth", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapPadding(value: Double): Self = StObject.set(x, "wrapPadding", value.asInstanceOf[js.Any])
      
      inline def setWrapPaddingUndefined: Self = StObject.set(x, "wrapPadding", js.undefined)
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait Config extends StObject {
    
    /**
      * Controls whether or arrow markers in html code are absolute paths or anchors
      *
      * This matters if you are using base tag settings.
      *
      * @default false
      */
    var arrowMarkerAbsolute: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The object containing configurations specific for c4 diagrams
      */
    var c4: js.UndefOr[C4Config] = js.undefined
    
    /**
      * This option is the optional seed for deterministic ids. if set to undefined but deterministicIds is true, a simple number iterator is used. You can set this attribute to base the seed on a
      * static string.
      */
    var deterministicIDSeed: js.UndefOr[String] = js.undefined
    
    /**
      * This option controls if the generated ids of nodes in the SVG are generated randomly or based on a seed. If set to false, the IDs are generated based on the current date and thus are not
      * deterministic. This is the default behaviour.
      *
      * This matters if your files are checked into sourcecontrol e.g. git and should not change unless content is changed.
      *
      * @default false
      */
    var deterministicIds: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The object containing configurations specific for entity relationship diagrams
      */
    var er: js.UndefOr[ERConfig] = js.undefined
    
    /**
      * The object containing configurations specific for flowcharts.
      */
    var flowchart: js.UndefOr[FlowChartConfig] = js.undefined
    
    /**
      * Specifies the font to be used in the rendered diagrams.
      *
      * @default '"trebuchet ms", verdana, arial, sans-serif;'
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * The object containing configurations specific for gantt diagrams
      */
    var gantt: js.UndefOr[GanttConfig] = js.undefined
    
    /**
      * The object containing configurations specific for journey diagrams
      */
    var journey: js.UndefOr[JourneyConfig] = js.undefined
    
    /**
      * This option decides the amount of logging to be used.
      *
      * - Debug: 1
      * - Info: 2
      * - Warn: 3
      * - Error: 4
      * - Fatal: 5
      *
      * @default 'fatal'
      */
    var logLevel: js.UndefOr[debug | error | fatal | info | warn] = js.undefined
    
    /**
      * The object containing configurations specific for pie diagrams
      */
    var pie: js.UndefOr[PieConfig] = js.undefined
    
    /**
      * The object containing configurations specific for req diagrams
      */
    var requirement: js.UndefOr[RequirementConfig] = js.undefined
    
    /**
      * This option controls which currentConfig keys are considered secure and can only be changed via call to mermaidAPI.initialize. Calls to mermaidAPI.reinitialize cannot make changes to the
      * `secure` keys in the current currentConfig. This prevents malicious graph directives from overriding a site's default security.
      *
      * @default ['secure', 'securityLevel', 'startOnLoad', 'maxTextSize']
      */
    var secure: js.UndefOr[
        js.Array[
          theme | fontFamily | logLevel | securityLevel | startOnLoad | arrowMarkerAbsolute | typings.mermaid.mermaidStrings.secure | deterministicIds | deterministicIDSeed | flowchart | sequence | gantt | journey | er | pie | requirement | c4
        ]
      ] = js.undefined
    
    /**
      * Level of trust for parsed diagram.
      *
      * - **strict**: tags in text are encoded, click functionality is disabled
      * - **loose**: tags in text are allowed, click functionality is enabled
      * - **antiscript**: html tags in text are allowed, (only script element is removed), click functionality is enabled
      * - **sandbox**: With this security level all rendering takes place in a sandboxed iframe. This prevent any JavaScript running in the context. This may hinder interactive functionality of the
      *   diagram like scripts, popups in sequence diagram or links to other tabs/targets etc.
      *
      * @default 'strict'
      */
    var securityLevel: js.UndefOr[antiscript | loose | sandbox | strict] = js.undefined
    
    /**
      * The object containing configurations specific for sequence diagrams
      */
    var sequence: js.UndefOr[SequenceConfig] = js.undefined
    
    /**
      * Dictates whether mermaid starts on Page load
      *
      * @default true
      */
    var startOnLoad: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Built in Themes
      *
      * To disable any pre-defined mermaid theme, use "null".
      */
    var theme: js.UndefOr[dark | typings.mermaid.mermaidStrings.default | forest | neutral | `null`] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setArrowMarkerAbsolute(value: Boolean): Self = StObject.set(x, "arrowMarkerAbsolute", value.asInstanceOf[js.Any])
      
      inline def setArrowMarkerAbsoluteUndefined: Self = StObject.set(x, "arrowMarkerAbsolute", js.undefined)
      
      inline def setC4(value: C4Config): Self = StObject.set(x, "c4", value.asInstanceOf[js.Any])
      
      inline def setC4Undefined: Self = StObject.set(x, "c4", js.undefined)
      
      inline def setDeterministicIDSeed(value: String): Self = StObject.set(x, "deterministicIDSeed", value.asInstanceOf[js.Any])
      
      inline def setDeterministicIDSeedUndefined: Self = StObject.set(x, "deterministicIDSeed", js.undefined)
      
      inline def setDeterministicIds(value: Boolean): Self = StObject.set(x, "deterministicIds", value.asInstanceOf[js.Any])
      
      inline def setDeterministicIdsUndefined: Self = StObject.set(x, "deterministicIds", js.undefined)
      
      inline def setEr(value: ERConfig): Self = StObject.set(x, "er", value.asInstanceOf[js.Any])
      
      inline def setErUndefined: Self = StObject.set(x, "er", js.undefined)
      
      inline def setFlowchart(value: FlowChartConfig): Self = StObject.set(x, "flowchart", value.asInstanceOf[js.Any])
      
      inline def setFlowchartUndefined: Self = StObject.set(x, "flowchart", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setGantt(value: GanttConfig): Self = StObject.set(x, "gantt", value.asInstanceOf[js.Any])
      
      inline def setGanttUndefined: Self = StObject.set(x, "gantt", js.undefined)
      
      inline def setJourney(value: JourneyConfig): Self = StObject.set(x, "journey", value.asInstanceOf[js.Any])
      
      inline def setJourneyUndefined: Self = StObject.set(x, "journey", js.undefined)
      
      inline def setLogLevel(value: debug | error | fatal | info | warn): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setPie(value: PieConfig): Self = StObject.set(x, "pie", value.asInstanceOf[js.Any])
      
      inline def setPieUndefined: Self = StObject.set(x, "pie", js.undefined)
      
      inline def setRequirement(value: RequirementConfig): Self = StObject.set(x, "requirement", value.asInstanceOf[js.Any])
      
      inline def setRequirementUndefined: Self = StObject.set(x, "requirement", js.undefined)
      
      inline def setSecure(
        value: js.Array[
              theme | fontFamily | logLevel | securityLevel | startOnLoad | arrowMarkerAbsolute | secure | deterministicIds | deterministicIDSeed | flowchart | sequence | gantt | journey | er | pie | requirement | c4
            ]
      ): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setSecureVarargs(
        value: (theme | fontFamily | logLevel | securityLevel | startOnLoad | arrowMarkerAbsolute | secure | deterministicIds | deterministicIDSeed | flowchart | sequence | gantt | journey | er | pie | requirement | c4)*
      ): Self = StObject.set(x, "secure", js.Array(value*))
      
      inline def setSecurityLevel(value: antiscript | loose | sandbox | strict): Self = StObject.set(x, "securityLevel", value.asInstanceOf[js.Any])
      
      inline def setSecurityLevelUndefined: Self = StObject.set(x, "securityLevel", js.undefined)
      
      inline def setSequence(value: SequenceConfig): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
      
      inline def setStartOnLoad(value: Boolean): Self = StObject.set(x, "startOnLoad", value.asInstanceOf[js.Any])
      
      inline def setStartOnLoadUndefined: Self = StObject.set(x, "startOnLoad", js.undefined)
      
      inline def setTheme(value: dark | typings.mermaid.mermaidStrings.default | forest | neutral | `null`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait ERConfig extends StObject {
    
    /**
      * Amount of padding around the diagram as a whole
      *
      * The amount of padding around the diagram as a whole so that embedded diagrams have margins, expressed in pixels
      *
      * @default 20
      */
    var diagramPadding: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum internal padding between text in box and box borders
      *
      * @default 15
      */
    var entityPadding: js.UndefOr[Double] = js.undefined
    
    /**
      * Fill color of entity boxes
      *
      * @default 'honeydew'
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /**
      * Font Size in pixels
      *
      * @default 12
      */
    var fontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Directional bias for layout of entities.
      *
      * 'TB' for Top-Bottom, 'BT' for Bottom-Top, 'LR' for Left-Right, or 'RL' for Right to Left.
      *
      * T = top, B = bottom, L = left, and R = right.
      *
      * @default 'TB'
      */
    var layoutDirection: js.UndefOr[BT | LR | RL | TB] = js.undefined
    
    /**
      * The minimum height of an entity box
      *
      * @default 75
      */
    var minEntityHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum width of an entity box
      *
      * @default 100
      */
    var minEntityWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Stroke color of box edges and lines
      *
      * @default 'gray'
      */
    var stroke: js.UndefOr[String] = js.undefined
    
    /**
      * When this flag is set to true, the diagram width is locked to 100% and scaled based on available space. If set to false, the diagram reserves its absolute width.
      *
      * @default true
      */
    var useMaxWidth: js.UndefOr[Boolean] = js.undefined
  }
  object ERConfig {
    
    inline def apply(): ERConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ERConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ERConfig] (val x: Self) extends AnyVal {
      
      inline def setDiagramPadding(value: Double): Self = StObject.set(x, "diagramPadding", value.asInstanceOf[js.Any])
      
      inline def setDiagramPaddingUndefined: Self = StObject.set(x, "diagramPadding", js.undefined)
      
      inline def setEntityPadding(value: Double): Self = StObject.set(x, "entityPadding", value.asInstanceOf[js.Any])
      
      inline def setEntityPaddingUndefined: Self = StObject.set(x, "entityPadding", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setLayoutDirection(value: BT | LR | RL | TB): Self = StObject.set(x, "layoutDirection", value.asInstanceOf[js.Any])
      
      inline def setLayoutDirectionUndefined: Self = StObject.set(x, "layoutDirection", js.undefined)
      
      inline def setMinEntityHeight(value: Double): Self = StObject.set(x, "minEntityHeight", value.asInstanceOf[js.Any])
      
      inline def setMinEntityHeightUndefined: Self = StObject.set(x, "minEntityHeight", js.undefined)
      
      inline def setMinEntityWidth(value: Double): Self = StObject.set(x, "minEntityWidth", value.asInstanceOf[js.Any])
      
      inline def setMinEntityWidthUndefined: Self = StObject.set(x, "minEntityWidth", js.undefined)
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setUseMaxWidth(value: Boolean): Self = StObject.set(x, "useMaxWidth", value.asInstanceOf[js.Any])
      
      inline def setUseMaxWidthUndefined: Self = StObject.set(x, "useMaxWidth", js.undefined)
    }
  }
  
  trait FlowChartConfig extends StObject {
    
    /**
      * Defines how mermaid renders curves for flowcharts.
      *
      * @default 'basis'
      */
    var curve: js.UndefOr[basis | cardinal | linear] = js.undefined
    
    /**
      * Decides which rendering engine that is to be used for the rendering. Legal values are?: dagre-d3 dagre-wrapper - wrapper for dagre implemented in mermaid.
      *
      * @default 'dagre-d3'
      */
    var defaultRenderer: js.UndefOr[`dagre-d3` | `dagre-wrapper`] = js.undefined
    
    /**
      * Amount of padding around the diagram as a whole.
      *
      * The amount of padding around the diagram as a whole so that embedded diagrams have margins, expressed in pixels.
      *
      * @default 8
      */
    var diagramPadding: js.UndefOr[Double] = js.undefined
    
    /**
      * Flag for setting whether or not a html tag should be used for rendering labels on the edges.
      *
      * @default true
      */
    var htmlLabels: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines the spacing between nodes on the same level.
      *
      * Pertains to horizontal spacing for TB (top to bottom) or BT (bottom to top) graphs, and the vertical spacing for LR as well as RL graphs.
      *
      * @default 50
      */
    var nodeSpacing: js.UndefOr[Double] = js.undefined
    
    /**
      * Defines the spacing between nodes on different levels.
      *
      * Pertains to vertical spacing for TB (top to bottom) or BT (bottom to top), and the horizontal spacing for LR as well as RL graphs.
      *
      * @default 50
      */
    var rankSpacing: js.UndefOr[Double] = js.undefined
    
    /**
      * When this flag is set the height and width is set to 100% and is then scaling with the available space if not the absolute space required is used.
      *
      * @default true
      */
    var useMaxWidth: js.UndefOr[Boolean] = js.undefined
  }
  object FlowChartConfig {
    
    inline def apply(): FlowChartConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlowChartConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlowChartConfig] (val x: Self) extends AnyVal {
      
      inline def setCurve(value: basis | cardinal | linear): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
      
      inline def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
      
      inline def setDefaultRenderer(value: `dagre-d3` | `dagre-wrapper`): Self = StObject.set(x, "defaultRenderer", value.asInstanceOf[js.Any])
      
      inline def setDefaultRendererUndefined: Self = StObject.set(x, "defaultRenderer", js.undefined)
      
      inline def setDiagramPadding(value: Double): Self = StObject.set(x, "diagramPadding", value.asInstanceOf[js.Any])
      
      inline def setDiagramPaddingUndefined: Self = StObject.set(x, "diagramPadding", js.undefined)
      
      inline def setHtmlLabels(value: Boolean): Self = StObject.set(x, "htmlLabels", value.asInstanceOf[js.Any])
      
      inline def setHtmlLabelsUndefined: Self = StObject.set(x, "htmlLabels", js.undefined)
      
      inline def setNodeSpacing(value: Double): Self = StObject.set(x, "nodeSpacing", value.asInstanceOf[js.Any])
      
      inline def setNodeSpacingUndefined: Self = StObject.set(x, "nodeSpacing", js.undefined)
      
      inline def setRankSpacing(value: Double): Self = StObject.set(x, "rankSpacing", value.asInstanceOf[js.Any])
      
      inline def setRankSpacingUndefined: Self = StObject.set(x, "rankSpacing", js.undefined)
      
      inline def setUseMaxWidth(value: Boolean): Self = StObject.set(x, "useMaxWidth", value.asInstanceOf[js.Any])
      
      inline def setUseMaxWidthUndefined: Self = StObject.set(x, "useMaxWidth", js.undefined)
    }
  }
  
  trait GanttConfig extends StObject {
    
    /**
      * Datetime format of the axis
      *
      * This might need adjustment to match your locale and preferences
      *
      * @default '%Y-%m-%d'
      */
    var axisFormat: js.UndefOr[String] = js.undefined
    
    /**
      * The margin between the different activities in the gantt diagram
      *
      * @default 4
      */
    var barGap: js.UndefOr[Double] = js.undefined
    
    /**
      * The height of the bars in the graph
      *
      * @default 20
      */
    var barHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Font size
      *
      * @default 11
      */
    var fontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Vertical starting position of the grid lines
      *
      * @default 35
      */
    var gridLineStartPadding: js.UndefOr[Double] = js.undefined
    
    /**
      * The space allocated for the section name to the left of the activities
      *
      * @default 75
      */
    var leftPadding: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of alternating section styles
      *
      * @default 4
      */
    var numberSectionStyles: js.UndefOr[Double] = js.undefined
    
    /**
      * The space allocated for the section name to the right of the activities
      *
      * @default 75
      */
    var rightPadding: js.UndefOr[Double] = js.undefined
    
    /**
      * Font size for sections
      *
      * @default 11
      */
    var sectionFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Margin top for the text over the gantt diagram
      *
      * @default 25
      */
    var titleTopMargin: js.UndefOr[Double] = js.undefined
    
    /**
      * When this flag is set date labels will be added to the top of the chart
      *
      * @default false
      */
    var topAxis: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Margin between title and gantt diagram and between axis and gantt diagram.
      *
      * @default 50
      */
    var topPadding: js.UndefOr[Double] = js.undefined
    
    /**
      * When this flag is set the height and width is set to 100% and is then scaling with the available space if not the absolute space required is used.
      *
      * @default true
      */
    var useMaxWidth: js.UndefOr[Boolean] = js.undefined
  }
  object GanttConfig {
    
    inline def apply(): GanttConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GanttConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GanttConfig] (val x: Self) extends AnyVal {
      
      inline def setAxisFormat(value: String): Self = StObject.set(x, "axisFormat", value.asInstanceOf[js.Any])
      
      inline def setAxisFormatUndefined: Self = StObject.set(x, "axisFormat", js.undefined)
      
      inline def setBarGap(value: Double): Self = StObject.set(x, "barGap", value.asInstanceOf[js.Any])
      
      inline def setBarGapUndefined: Self = StObject.set(x, "barGap", js.undefined)
      
      inline def setBarHeight(value: Double): Self = StObject.set(x, "barHeight", value.asInstanceOf[js.Any])
      
      inline def setBarHeightUndefined: Self = StObject.set(x, "barHeight", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setGridLineStartPadding(value: Double): Self = StObject.set(x, "gridLineStartPadding", value.asInstanceOf[js.Any])
      
      inline def setGridLineStartPaddingUndefined: Self = StObject.set(x, "gridLineStartPadding", js.undefined)
      
      inline def setLeftPadding(value: Double): Self = StObject.set(x, "leftPadding", value.asInstanceOf[js.Any])
      
      inline def setLeftPaddingUndefined: Self = StObject.set(x, "leftPadding", js.undefined)
      
      inline def setNumberSectionStyles(value: Double): Self = StObject.set(x, "numberSectionStyles", value.asInstanceOf[js.Any])
      
      inline def setNumberSectionStylesUndefined: Self = StObject.set(x, "numberSectionStyles", js.undefined)
      
      inline def setRightPadding(value: Double): Self = StObject.set(x, "rightPadding", value.asInstanceOf[js.Any])
      
      inline def setRightPaddingUndefined: Self = StObject.set(x, "rightPadding", js.undefined)
      
      inline def setSectionFontSize(value: Double): Self = StObject.set(x, "sectionFontSize", value.asInstanceOf[js.Any])
      
      inline def setSectionFontSizeUndefined: Self = StObject.set(x, "sectionFontSize", js.undefined)
      
      inline def setTitleTopMargin(value: Double): Self = StObject.set(x, "titleTopMargin", value.asInstanceOf[js.Any])
      
      inline def setTitleTopMarginUndefined: Self = StObject.set(x, "titleTopMargin", js.undefined)
      
      inline def setTopAxis(value: Boolean): Self = StObject.set(x, "topAxis", value.asInstanceOf[js.Any])
      
      inline def setTopAxisUndefined: Self = StObject.set(x, "topAxis", js.undefined)
      
      inline def setTopPadding(value: Double): Self = StObject.set(x, "topPadding", value.asInstanceOf[js.Any])
      
      inline def setTopPaddingUndefined: Self = StObject.set(x, "topPadding", js.undefined)
      
      inline def setUseMaxWidth(value: Boolean): Self = StObject.set(x, "useMaxWidth", value.asInstanceOf[js.Any])
      
      inline def setUseMaxWidthUndefined: Self = StObject.set(x, "useMaxWidth", js.undefined)
    }
  }
  
  trait JourneyConfig extends StObject {
    
    /**
      * Margin between actors
      *
      * @default 50
      */
    var actorMargin: js.UndefOr[Double] = js.undefined
    
    /**
      * Prolongs the edge of the diagram downwards
      *
      * Depending on css styling this might need adjustment.
      *
      * @default 1
      */
    var bottomMarginAdj: js.UndefOr[Double] = js.undefined
    
    /**
      * Margin around loop boxes
      *
      * @default 10
      */
    var boxMargin: js.UndefOr[Double] = js.undefined
    
    /**
      * Margin around the text in loop/alt/opt boxes
      *
      * @default 5
      */
    var boxTextMargin: js.UndefOr[Double] = js.undefined
    
    /**
      * Decides which rendering engine that is to be used for the rendering. Legal values are?: dagre-d3 dagre-wrapper - wrapper for dagre implemented in mermaid
      *
      * @default 'dagre-d3'
      */
    var defaultRenderer: js.UndefOr[`dagre-d3` | `dagre-wrapper`] = js.undefined
    
    /**
      * Margin to the right and left of the sequence diagram
      *
      * @default 50
      */
    var diagramMarginX: js.UndefOr[Double] = js.undefined
    
    /**
      * Margin to the over and under the sequence diagram.
      *
      * @default 10
      */
    var diagramMarginY: js.UndefOr[Double] = js.undefined
    
    /**
      * Height of actor boxes
      *
      * @default 65
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Multiline message alignment
      *
      * @default 'center'
      */
    var messageAlign: js.UndefOr[center | left | right] = js.undefined
    
    /**
      * Space between messages.
      *
      * @default 35
      */
    var messageMargin: js.UndefOr[Double] = js.undefined
    
    /**
      * Margin around notes
      *
      * @default 10
      */
    var noteMargin: js.UndefOr[Double] = js.undefined
    
    /**
      * Curved Arrows become Right Angles
      *
      * This will display arrows that start and begin at the same node as right angles, rather than a curves
      *
      * @default false
      */
    var rightAngles: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When this flag is set the height and width is set to 100% and is then scaling with the available space if not the absolute space required is used.
      *
      * @default true
      */
    var useMaxWidth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Width of actor boxes
      *
      * @default 150
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object JourneyConfig {
    
    inline def apply(): JourneyConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JourneyConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JourneyConfig] (val x: Self) extends AnyVal {
      
      inline def setActorMargin(value: Double): Self = StObject.set(x, "actorMargin", value.asInstanceOf[js.Any])
      
      inline def setActorMarginUndefined: Self = StObject.set(x, "actorMargin", js.undefined)
      
      inline def setBottomMarginAdj(value: Double): Self = StObject.set(x, "bottomMarginAdj", value.asInstanceOf[js.Any])
      
      inline def setBottomMarginAdjUndefined: Self = StObject.set(x, "bottomMarginAdj", js.undefined)
      
      inline def setBoxMargin(value: Double): Self = StObject.set(x, "boxMargin", value.asInstanceOf[js.Any])
      
      inline def setBoxMarginUndefined: Self = StObject.set(x, "boxMargin", js.undefined)
      
      inline def setBoxTextMargin(value: Double): Self = StObject.set(x, "boxTextMargin", value.asInstanceOf[js.Any])
      
      inline def setBoxTextMarginUndefined: Self = StObject.set(x, "boxTextMargin", js.undefined)
      
      inline def setDefaultRenderer(value: `dagre-d3` | `dagre-wrapper`): Self = StObject.set(x, "defaultRenderer", value.asInstanceOf[js.Any])
      
      inline def setDefaultRendererUndefined: Self = StObject.set(x, "defaultRenderer", js.undefined)
      
      inline def setDiagramMarginX(value: Double): Self = StObject.set(x, "diagramMarginX", value.asInstanceOf[js.Any])
      
      inline def setDiagramMarginXUndefined: Self = StObject.set(x, "diagramMarginX", js.undefined)
      
      inline def setDiagramMarginY(value: Double): Self = StObject.set(x, "diagramMarginY", value.asInstanceOf[js.Any])
      
      inline def setDiagramMarginYUndefined: Self = StObject.set(x, "diagramMarginY", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMessageAlign(value: center | left | right): Self = StObject.set(x, "messageAlign", value.asInstanceOf[js.Any])
      
      inline def setMessageAlignUndefined: Self = StObject.set(x, "messageAlign", js.undefined)
      
      inline def setMessageMargin(value: Double): Self = StObject.set(x, "messageMargin", value.asInstanceOf[js.Any])
      
      inline def setMessageMarginUndefined: Self = StObject.set(x, "messageMargin", js.undefined)
      
      inline def setNoteMargin(value: Double): Self = StObject.set(x, "noteMargin", value.asInstanceOf[js.Any])
      
      inline def setNoteMarginUndefined: Self = StObject.set(x, "noteMargin", js.undefined)
      
      inline def setRightAngles(value: Boolean): Self = StObject.set(x, "rightAngles", value.asInstanceOf[js.Any])
      
      inline def setRightAnglesUndefined: Self = StObject.set(x, "rightAngles", js.undefined)
      
      inline def setUseMaxWidth(value: Boolean): Self = StObject.set(x, "useMaxWidth", value.asInstanceOf[js.Any])
      
      inline def setUseMaxWidthUndefined: Self = StObject.set(x, "useMaxWidth", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Mermaid extends StObject {
    
    // tslint:disable-next-line: ban-types
    var contentLoaded: js.Function
    
    /**
      * @deprecated
      */
    var htmlLabels: Boolean
    
    /**
      * @deprecated
      */
    // tslint:disable-next-line: ban-types
    var init: js.Function
    
    // tslint:disable-next-line: ban-types
    var initThrowsErrors: js.Function
    
    def initialize(options: Config): Unit
    @JSName("initialize")
    var initialize_Original: js.Function1[/* options */ Config, Unit]
    
    var mermaidAPI: MermaidAPI
    
    def parse(txt: String): Boolean
    @JSName("parse")
    var parse_Original: js.Function1[/* txt */ String, Boolean]
    
    def render(id: String, _txt: String): String
    def render(
      id: String,
      _txt: String,
      cb: js.Function2[
          /* svgCode */ String, 
          /* bindFunctions */ js.Function1[/* element */ Element, Unit], 
          Unit
        ]
    ): String
    def render(
      id: String,
      _txt: String,
      cb: js.Function2[
          /* svgCode */ String, 
          /* bindFunctions */ js.Function1[/* element */ Element, Unit], 
          Unit
        ],
      container: String
    ): String
    def render(
      id: String,
      _txt: String,
      cb: js.Function2[
          /* svgCode */ String, 
          /* bindFunctions */ js.Function1[/* element */ Element, Unit], 
          Unit
        ],
      container: Element
    ): String
    def render(id: String, _txt: String, cb: Unit, container: String): String
    def render(id: String, _txt: String, cb: Unit, container: Element): String
    @JSName("render")
    var render_Original: js.Function4[
        /* id */ String, 
        /* _txt */ String, 
        /* cb */ js.UndefOr[
          js.Function2[
            /* svgCode */ String, 
            /* bindFunctions */ js.Function1[/* element */ Element, Unit], 
            Unit
          ]
        ], 
        /* container */ js.UndefOr[String | Element], 
        String
      ]
    
    // tslint:disable-next-line: ban-types
    var setParseErrorHandler: js.Function
    
    /**
      * @deprecated
      */
    var startOnLoad: Boolean
  }
  object Mermaid {
    
    inline def apply(
      contentLoaded: js.Function,
      htmlLabels: Boolean,
      init: js.Function,
      initThrowsErrors: js.Function,
      initialize: /* options */ Config => Unit,
      mermaidAPI: MermaidAPI,
      parse: /* txt */ String => Boolean,
      render: (/* id */ String, /* _txt */ String, /* cb */ js.UndefOr[
          js.Function2[
            /* svgCode */ String, 
            /* bindFunctions */ js.Function1[/* element */ Element, Unit], 
            Unit
          ]
        ], /* container */ js.UndefOr[String | Element]) => String,
      setParseErrorHandler: js.Function,
      startOnLoad: Boolean
    ): Mermaid = {
      val __obj = js.Dynamic.literal(contentLoaded = contentLoaded.asInstanceOf[js.Any], htmlLabels = htmlLabels.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], initThrowsErrors = initThrowsErrors.asInstanceOf[js.Any], initialize = js.Any.fromFunction1(initialize), mermaidAPI = mermaidAPI.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), render = js.Any.fromFunction4(render), setParseErrorHandler = setParseErrorHandler.asInstanceOf[js.Any], startOnLoad = startOnLoad.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mermaid]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mermaid] (val x: Self) extends AnyVal {
      
      inline def setContentLoaded(value: js.Function): Self = StObject.set(x, "contentLoaded", value.asInstanceOf[js.Any])
      
      inline def setHtmlLabels(value: Boolean): Self = StObject.set(x, "htmlLabels", value.asInstanceOf[js.Any])
      
      inline def setInit(value: js.Function): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      inline def setInitThrowsErrors(value: js.Function): Self = StObject.set(x, "initThrowsErrors", value.asInstanceOf[js.Any])
      
      inline def setInitialize(value: /* options */ Config => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
      
      inline def setMermaidAPI(value: MermaidAPI): Self = StObject.set(x, "mermaidAPI", value.asInstanceOf[js.Any])
      
      inline def setParse(value: /* txt */ String => Boolean): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setRender(
        value: (/* id */ String, /* _txt */ String, /* cb */ js.UndefOr[
              js.Function2[
                /* svgCode */ String, 
                /* bindFunctions */ js.Function1[/* element */ Element, Unit], 
                Unit
              ]
            ], /* container */ js.UndefOr[String | Element]) => String
      ): Self = StObject.set(x, "render", js.Any.fromFunction4(value))
      
      inline def setSetParseErrorHandler(value: js.Function): Self = StObject.set(x, "setParseErrorHandler", value.asInstanceOf[js.Any])
      
      inline def setStartOnLoad(value: Boolean): Self = StObject.set(x, "startOnLoad", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MermaidAPI extends StObject {
    
    var defaultConfig: Config = js.native
    
    /**
      * Obtains the currentConfig
      *
      * @returns The currentConfig
      */
    def getConfig(): Config = js.native
    
    /**
      * Returns the current siteConfig base configuration
      */
    def getSiteConfig(): Config = js.native
    
    // tslint:disable-next-line: ban-types
    var globalReset: js.Function = js.native
    
    def initialize(options: Config): Unit = js.native
    
    def parse(txt: String): Boolean = js.native
    
    /**
      * @deprecated
      */
    var reinitialize: Any = js.native
    
    /**
      * Function that renders an svg with a graph from a chart definition. Usage example below.
      *
      * ```js
      * mermaidAPI.initialize({
      *   startOnLoad: true,
      * });
      * $(function () {
      *   const graphDefinition = 'graph TB\na-->b';
      *   const cb = function (svgGraph) {
      *     console.log(svgGraph);
      *   };
      *   mermaidAPI.render('id1', graphDefinition, cb);
      * });
      * ```
      *
      * @param id the id of the element to be rendered
      * @param _txt the graph definition
      * @param cb callback which is called after rendering is finished with the svg code as inparam.
      * @param container selector to element in which a div with the graph temporarily will be inserted. In one is
      * provided a hidden div will be inserted in the body of the page instead. The element will be removed when rendering is
      * completed.
      */
    def render(id: String, _txt: String): String = js.native
    def render(
      id: String,
      _txt: String,
      cb: js.Function2[
          /* svgCode */ String, 
          /* bindFunctions */ js.Function1[/* element */ Element, Unit], 
          Unit
        ]
    ): String = js.native
    def render(
      id: String,
      _txt: String,
      cb: js.Function2[
          /* svgCode */ String, 
          /* bindFunctions */ js.Function1[/* element */ Element, Unit], 
          Unit
        ],
      container: String
    ): String = js.native
    def render(
      id: String,
      _txt: String,
      cb: js.Function2[
          /* svgCode */ String, 
          /* bindFunctions */ js.Function1[/* element */ Element, Unit], 
          Unit
        ],
      container: Element
    ): String = js.native
    def render(id: String, _txt: String, cb: Unit, container: String): String = js.native
    def render(id: String, _txt: String, cb: Unit, container: Element): String = js.native
    
    /**
      * Resets currentConfig to conf.
      *
      * @param conf base set of values, which currentConfig could be reset to.
      */
    def reset(): Unit = js.native
    def reset(conf: Config): Unit = js.native
    
    /**
      * Sets the currentConfig. The parameter conf is sanitized based on the siteConfig.secure keys. Any values found in conf with key found in siteConfig.secure will be replaced with the
      * corresponding siteConfig value.
      *
      * @param conf The potential currentConfig
      * @returns The currentConfig merged with the sanitized conf
      */
    def setConfig(conf: Config): Config = js.native
    
    /**
      * Sets the siteConfig to desired values.
      *
      * The siteConfig is a protected configuration for repeat use. Calls to reset() will reset the currentConfig to siteConfig. Calls to reset(configApi.defaultConfig) will reset siteConfig and
      * currentConfig to the defaultConfig Note: currentConfig is set in this function Default value: At default, will mirror Global Config
      *
      * @param conf The base currentConfig to use as siteConfig
      */
    def updateSiteConfig(conf: Config): Config = js.native
  }
  
  trait PieConfig extends StObject {
    
    /**
      * When this flag is set to true, the diagram width is locked to 100% and scaled based on available space. If set to false, the diagram reserves its absolute width.
      *
      * @default true
      */
    var useMaxWidth: js.UndefOr[Boolean] = js.undefined
  }
  object PieConfig {
    
    inline def apply(): PieConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PieConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PieConfig] (val x: Self) extends AnyVal {
      
      inline def setUseMaxWidth(value: Boolean): Self = StObject.set(x, "useMaxWidth", value.asInstanceOf[js.Any])
      
      inline def setUseMaxWidthUndefined: Self = StObject.set(x, "useMaxWidth", js.undefined)
    }
  }
  
  trait RequirementConfig extends StObject {
    
    /**
      * When this flag is set to true, the diagram width is locked to 100% and scaled based on available space. If set to false, the diagram reserves its absolute width.
      *
      * @default true
      */
    var useMaxWidth: js.UndefOr[Boolean] = js.undefined
  }
  object RequirementConfig {
    
    inline def apply(): RequirementConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequirementConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequirementConfig] (val x: Self) extends AnyVal {
      
      inline def setUseMaxWidth(value: Boolean): Self = StObject.set(x, "useMaxWidth", value.asInstanceOf[js.Any])
      
      inline def setUseMaxWidthUndefined: Self = StObject.set(x, "useMaxWidth", js.undefined)
    }
  }
  
  trait SequenceConfig extends StObject {
    
    /**
      * Width of the activation rect.
      *
      * @default 10
      */
    var activationWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font family of the actor's description
      *
      * @default '"Open Sans", sans-serif'
      */
    var actorFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font size of the actor's description
      *
      * @default 14
      */
    var actorFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font weight of the actor's description
      *
      * @default 400
      */
    var actorFontWeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Margin between actors
      *
      * @default 10
      */
    var actorMargin: js.UndefOr[Double] = js.undefined
    
    /**
      * Prolongs the edge of the diagram downwards
      *
      * Depending on css styling this might need adjustment.
      *
      * @default 1
      */
    var bottomMarginAdj: js.UndefOr[Double] = js.undefined
    
    /**
      * Margin around loop boxes
      *
      * @default 10
      */
    var boxMargin: js.UndefOr[Double] = js.undefined
    
    /**
      * Margin around the text in loop/alt/opt boxes
      *
      * @default 5
      */
    var boxTextMargin: js.UndefOr[Double] = js.undefined
    
    /**
      * Margin to the right and left of the sequence diagram
      *
      * @default 50
      */
    var diagramMarginX: js.UndefOr[Double] = js.undefined
    
    /**
      * Margin to the over and under the sequence diagram
      *
      * @default 10
      */
    var diagramMarginY: js.UndefOr[Double] = js.undefined
    
    /**
      * Forces actor popup menus to always be visible (to support E2E testing).
      *
      * @default false
      */
    var forceMenus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Height of actor boxes
      *
      * @default 65
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the height of the loop-box (loop, alt, opt, par)
      *
      * @default 20
      */
    var labelBoxHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the width of the loop-box (loop, alt, opt, par)
      *
      * @default 50
      */
    var labelBoxWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Multiline message alignment
      *
      * @default 'center'
      */
    var messageAlign: js.UndefOr[center | left | right] = js.undefined
    
    /**
      * This sets the font family of actor messages
      *
      * @default '"trebuchet ms", verdana, arial, sans-serif'
      */
    var messageFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font size of actor messages
      *
      * @default 16
      */
    var messageFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font weight of the message's description
      *
      * @default 400
      */
    var messageFontWeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Space between messages
      *
      * @default 35
      */
    var messageMargin: js.UndefOr[Double] = js.undefined
    
    /**
      * Mirror actors under diagram
      *
      * @default true
      */
    var mirrorActors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This sets the text alignment of actor-attached notes
      *
      * @default 'center'
      */
    var noteAlign: js.UndefOr[center | left | right] = js.undefined
    
    /**
      * This sets the font family of actor-attached notes.
      *
      * @default '"trebuchet ms", verdana, arial, sans-serif'
      */
    var noteFontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the font size of actor-attached notes
      *
      * @default 14
      */
    var noteFontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the font weight of the note's description
      *
      * @default 400
      */
    var noteFontWeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Margin around notes
      *
      * @default 10
      */
    var noteMargin: js.UndefOr[Double] = js.undefined
    
    /**
      * Display curve arrows as right angles
      *
      * This will display arrows that start and begin at the same node as right angles, rather than a curve
      *
      * @default false
      */
    var rightAngles: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This will show the node numbers
      *
      * @default false
      */
    var showSequenceNumbers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When this flag is set to true, the height and width is set to 100% and is then scaling with the available space. If set to false, the absolute space required is used.
      *
      * @default true
      */
    var useMaxWidth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Width of actor boxes
      *
      * @default 150
      */
    var width: js.UndefOr[Double] = js.undefined
    
    /**
      * This sets the auto-wrap state for the diagram
      *
      * @default false
      */
    var wrap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This sets the auto-wrap padding for the diagram (sides only)
      *
      * @default 0
      */
    var wrapPadding: js.UndefOr[Double] = js.undefined
  }
  object SequenceConfig {
    
    inline def apply(): SequenceConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SequenceConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SequenceConfig] (val x: Self) extends AnyVal {
      
      inline def setActivationWidth(value: Double): Self = StObject.set(x, "activationWidth", value.asInstanceOf[js.Any])
      
      inline def setActivationWidthUndefined: Self = StObject.set(x, "activationWidth", js.undefined)
      
      inline def setActorFontFamily(value: String): Self = StObject.set(x, "actorFontFamily", value.asInstanceOf[js.Any])
      
      inline def setActorFontFamilyUndefined: Self = StObject.set(x, "actorFontFamily", js.undefined)
      
      inline def setActorFontSize(value: Double): Self = StObject.set(x, "actorFontSize", value.asInstanceOf[js.Any])
      
      inline def setActorFontSizeUndefined: Self = StObject.set(x, "actorFontSize", js.undefined)
      
      inline def setActorFontWeight(value: Double): Self = StObject.set(x, "actorFontWeight", value.asInstanceOf[js.Any])
      
      inline def setActorFontWeightUndefined: Self = StObject.set(x, "actorFontWeight", js.undefined)
      
      inline def setActorMargin(value: Double): Self = StObject.set(x, "actorMargin", value.asInstanceOf[js.Any])
      
      inline def setActorMarginUndefined: Self = StObject.set(x, "actorMargin", js.undefined)
      
      inline def setBottomMarginAdj(value: Double): Self = StObject.set(x, "bottomMarginAdj", value.asInstanceOf[js.Any])
      
      inline def setBottomMarginAdjUndefined: Self = StObject.set(x, "bottomMarginAdj", js.undefined)
      
      inline def setBoxMargin(value: Double): Self = StObject.set(x, "boxMargin", value.asInstanceOf[js.Any])
      
      inline def setBoxMarginUndefined: Self = StObject.set(x, "boxMargin", js.undefined)
      
      inline def setBoxTextMargin(value: Double): Self = StObject.set(x, "boxTextMargin", value.asInstanceOf[js.Any])
      
      inline def setBoxTextMarginUndefined: Self = StObject.set(x, "boxTextMargin", js.undefined)
      
      inline def setDiagramMarginX(value: Double): Self = StObject.set(x, "diagramMarginX", value.asInstanceOf[js.Any])
      
      inline def setDiagramMarginXUndefined: Self = StObject.set(x, "diagramMarginX", js.undefined)
      
      inline def setDiagramMarginY(value: Double): Self = StObject.set(x, "diagramMarginY", value.asInstanceOf[js.Any])
      
      inline def setDiagramMarginYUndefined: Self = StObject.set(x, "diagramMarginY", js.undefined)
      
      inline def setForceMenus(value: Boolean): Self = StObject.set(x, "forceMenus", value.asInstanceOf[js.Any])
      
      inline def setForceMenusUndefined: Self = StObject.set(x, "forceMenus", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLabelBoxHeight(value: Double): Self = StObject.set(x, "labelBoxHeight", value.asInstanceOf[js.Any])
      
      inline def setLabelBoxHeightUndefined: Self = StObject.set(x, "labelBoxHeight", js.undefined)
      
      inline def setLabelBoxWidth(value: Double): Self = StObject.set(x, "labelBoxWidth", value.asInstanceOf[js.Any])
      
      inline def setLabelBoxWidthUndefined: Self = StObject.set(x, "labelBoxWidth", js.undefined)
      
      inline def setMessageAlign(value: center | left | right): Self = StObject.set(x, "messageAlign", value.asInstanceOf[js.Any])
      
      inline def setMessageAlignUndefined: Self = StObject.set(x, "messageAlign", js.undefined)
      
      inline def setMessageFontFamily(value: String): Self = StObject.set(x, "messageFontFamily", value.asInstanceOf[js.Any])
      
      inline def setMessageFontFamilyUndefined: Self = StObject.set(x, "messageFontFamily", js.undefined)
      
      inline def setMessageFontSize(value: Double): Self = StObject.set(x, "messageFontSize", value.asInstanceOf[js.Any])
      
      inline def setMessageFontSizeUndefined: Self = StObject.set(x, "messageFontSize", js.undefined)
      
      inline def setMessageFontWeight(value: Double): Self = StObject.set(x, "messageFontWeight", value.asInstanceOf[js.Any])
      
      inline def setMessageFontWeightUndefined: Self = StObject.set(x, "messageFontWeight", js.undefined)
      
      inline def setMessageMargin(value: Double): Self = StObject.set(x, "messageMargin", value.asInstanceOf[js.Any])
      
      inline def setMessageMarginUndefined: Self = StObject.set(x, "messageMargin", js.undefined)
      
      inline def setMirrorActors(value: Boolean): Self = StObject.set(x, "mirrorActors", value.asInstanceOf[js.Any])
      
      inline def setMirrorActorsUndefined: Self = StObject.set(x, "mirrorActors", js.undefined)
      
      inline def setNoteAlign(value: center | left | right): Self = StObject.set(x, "noteAlign", value.asInstanceOf[js.Any])
      
      inline def setNoteAlignUndefined: Self = StObject.set(x, "noteAlign", js.undefined)
      
      inline def setNoteFontFamily(value: String): Self = StObject.set(x, "noteFontFamily", value.asInstanceOf[js.Any])
      
      inline def setNoteFontFamilyUndefined: Self = StObject.set(x, "noteFontFamily", js.undefined)
      
      inline def setNoteFontSize(value: Double): Self = StObject.set(x, "noteFontSize", value.asInstanceOf[js.Any])
      
      inline def setNoteFontSizeUndefined: Self = StObject.set(x, "noteFontSize", js.undefined)
      
      inline def setNoteFontWeight(value: Double): Self = StObject.set(x, "noteFontWeight", value.asInstanceOf[js.Any])
      
      inline def setNoteFontWeightUndefined: Self = StObject.set(x, "noteFontWeight", js.undefined)
      
      inline def setNoteMargin(value: Double): Self = StObject.set(x, "noteMargin", value.asInstanceOf[js.Any])
      
      inline def setNoteMarginUndefined: Self = StObject.set(x, "noteMargin", js.undefined)
      
      inline def setRightAngles(value: Boolean): Self = StObject.set(x, "rightAngles", value.asInstanceOf[js.Any])
      
      inline def setRightAnglesUndefined: Self = StObject.set(x, "rightAngles", js.undefined)
      
      inline def setShowSequenceNumbers(value: Boolean): Self = StObject.set(x, "showSequenceNumbers", value.asInstanceOf[js.Any])
      
      inline def setShowSequenceNumbersUndefined: Self = StObject.set(x, "showSequenceNumbers", js.undefined)
      
      inline def setUseMaxWidth(value: Boolean): Self = StObject.set(x, "useMaxWidth", value.asInstanceOf[js.Any])
      
      inline def setUseMaxWidthUndefined: Self = StObject.set(x, "useMaxWidth", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapPadding(value: Double): Self = StObject.set(x, "wrapPadding", value.asInstanceOf[js.Any])
      
      inline def setWrapPaddingUndefined: Self = StObject.set(x, "wrapPadding", js.undefined)
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  type _To = Mermaid
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Mermaid = default
}
