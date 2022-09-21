package typings.popoto

import typings.popoto.anon.Edges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resultMod {
  
  object Result {
    
    @JSImport("popoto/result", "Result")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("popoto/result", "Result.RESULTS_PAGE_SIZE")
    @js.native
    val RESULTS_PAGE_SIZE: Double = js.native
    
    @JSImport("popoto/result", "Result.TOTAL_COUNT")
    @js.native
    val TOTAL_COUNT: Double = js.native
    
    @JSImport("popoto/result", "Result.containerId")
    @js.native
    val containerId: String = js.native
    
    inline def generatePreQuery(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePreQuery")().asInstanceOf[Unit]
    
    @JSImport("popoto/result", "Result.graphResultListeners")
    @js.native
    val graphResultListeners: js.Array[js.Function0[Unit]] = js.native
    
    @JSImport("popoto/result", "Result.hasChanged")
    @js.native
    val hasChanged: Boolean = js.native
    
    inline def onGraphResultReceived(listerner: js.Function1[/* graphResult */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onGraphResultReceived")(listerner.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onResultReceived(
      listerner: js.Function1[
          /* result */ js.Array[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N4jResult */ Any
          ], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onResultReceived")(listerner.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Register a listener to the result count event.
      * This listener will be called on evry result change with total result count.
      */
    inline def onTotalResultCount(listerner: js.Function1[/* count */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onTotalResultCount")(listerner.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Parse REST returned Graph data and generate a list of nodes and edges.
      *
      * @param data
      * @returns an object with two keys: nodes, edges
      */
    inline def parseGraphResultData(data: Any): Edges = ^.asInstanceOf[js.Dynamic].applyDynamic("parseGraphResultData")(data.asInstanceOf[js.Any]).asInstanceOf[Edges]
    
    @JSImport("popoto/result", "Result.resultCountListeners")
    @js.native
    val resultCountListeners: js.Array[js.Function1[/* count */ Double, Unit]] = js.native
    
    @JSImport("popoto/result", "Result.resultListeners")
    @js.native
    val resultListeners: js.Array[
        js.Function1[
          /* result */ js.Array[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N4jResult */ Any
          ], 
          Unit
        ]
      ] = js.native
    
    inline def updateResults(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateResults")().asInstanceOf[Unit]
    
    inline def updateResultsCount(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateResultsCount")().asInstanceOf[Unit]
  }
}
