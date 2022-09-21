package typings.popoto

import org.scalablytyped.runtime.Shortcut
import typings.popoto.anon.TypeofQuery
import typings.popoto.anon.TypeofQueryViewer
import typings.popoto.anon.TypeofResult
import typings.popoto.anon.TypeofRunner
import typings.popoto.anon.TypeofTaxonomy
import typings.popoto.anon.TypeofToolbar
import typings.popoto.anon.TypeofTools
import typings.popoto.cypherviewerMod.CypherViewer
import typings.popoto.dataModelMod.DataModel
import typings.popoto.graphMod.Graph
import typings.popoto.graphMod.GraphSchema
import typings.popoto.loggerMod.Logger
import typings.popoto.providerMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("popoto", JSImport.Namespace)
  @js.native
  val ^ : Popoto = js.native
  
  @js.native
  trait Popoto extends StObject {
    
    /**
      * Create the text representation of a node by slicing the text into lines to fit the node.
      *
      * @param selection
      * @param textParam
      * @param radiusParam
      * @param classParam
      */
    def appendFittedText(selection: Any, textParam: String, radiusParam: Double): Unit = js.native
    def appendFittedText(selection: Any, textParam: String, radiusParam: Double, classParam: Any): Unit = js.native
    
    var cypherviewer: CypherViewer = js.native
    
    var dataModel: DataModel = js.native
    
    var graph: Graph = js.native
    
    var logger: Logger = js.native
    
    var provider: Provider = js.native
    
    var query: TypeofQuery = js.native
    
    var queryviewer: TypeofQueryViewer = js.native
    
    var result: TypeofResult = js.native
    
    var runner: TypeofRunner = js.native
    
    /**
      * Main function to call to use Popoto.js.
      * This function will create all the HTML content based on available IDs in the page.
      *
      * @param startParam Root label or graph schema to use in the graph query builder.
      */
    def start(startParam: String): Unit = js.native
    def start(startParam: GraphSchema): Unit = js.native
    
    var taxonomy: TypeofTaxonomy = js.native
    
    var toolbar: TypeofToolbar = js.native
    
    var tools: TypeofTools = js.native
    
    /**
      * Function to call to update all the generated elements including svg graph, query viewer and generated results.
      */
    def update(): Unit = js.native
    
    /**
      * Function to call to update the graph only.
      */
    def updateGraph(): Unit = js.native
    
    var version: Double = js.native
  }
  
  type _To = Popoto
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Popoto = ^
}
