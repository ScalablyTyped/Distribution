package typings.powerbiVisualsTools.mod

import typings.powerbiVisualsTools.mod.data.Selector
import typings.powerbiVisualsTools.mod.data.SelectorsByColumn
import typings.powerbiVisualsTools.mod.extensibility.IVisual
import typings.powerbiVisualsTools.mod.extensibility.VisualConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visuals {
  
  @js.native
  trait ISelectionId extends StObject {
    
    def equals(other: ISelectionId): Boolean = js.native
    
    def getKey(): String = js.native
    
    def getSelector(): Selector = js.native
    
    def getSelectorsByColumn(): SelectorsByColumn = js.native
    
    def hasIdentity(): Boolean = js.native
    
    def includes(other: ISelectionId): Boolean = js.native
    def includes(other: ISelectionId, ignoreHighlight: Boolean): Boolean = js.native
  }
  
  @js.native
  trait ISelectionIdBuilder extends StObject {
    
    def createSelectionId(): ISelectionId = js.native
    
    def withCategory(categoryColumn: DataViewCategoryColumn, index: Double): this.type = js.native
    
    def withMeasure(measureId: String): this.type = js.native
    
    def withSeries(seriesColumn: DataViewValueColumns, valueColumn: DataViewValueColumn): this.type = js.native
    def withSeries(seriesColumn: DataViewValueColumns, valueColumn: DataViewValueColumnGroup): this.type = js.native
  }
  
  object plugins {
    
    /** This IVisualPlugin interface is only used by the CLI tools when compiling */
    @js.native
    trait IVisualPlugin extends StObject {
      
      /** The version of the api that this plugin should be run against */
      var apiVersion: String = js.native
      
      /** The class of the plugin.  At the moment it is only used to have a way to indicate the class name that a custom visual has. */
      var `class`: String = js.native
      
      /** Function to call to create the visual. */
      def create(): IVisual = js.native
      def create(options: VisualConstructorOptions): IVisual = js.native
      
      /** Check if a visual is custom */
      var custom: Boolean = js.native
      
      /** Human readable plugin name displayed to users */
      var displayName: String = js.native
      
      /** The name of the plugin.  Must match the property name in powerbi.visuals. */
      var name: String = js.native
    }
  }
}
