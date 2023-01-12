package typings.nodeUci

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-uci", "Engine")
  @js.native
  open class Engine protected () extends StObject {
    def this(enginePath: String) = this()
    
    def chain(): EngineChain = js.native
    
    def getBufferUntil(fn: js.Function1[/* str */ String, Boolean]): js.Promise[js.Array[String]] = js.native
    
    def go(sp: SearchOptions): js.Promise[SearchResult] = js.native
    
    def goInfinite(sp: SearchOptions): EventEmitter = js.native
    
    def init(): js.Promise[Engine] = js.native
    
    def isready(): js.Promise[Engine] = js.native
    
    def ponderhit(): js.Promise[Engine] = js.native
    
    def position(fen: String): js.Promise[Engine] = js.native
    def position(fen: String, moves: js.Array[String]): js.Promise[Engine] = js.native
    
    def quit(): js.Promise[Engine] = js.native
    
    def sendCmd(cmd: String): js.Promise[Engine] = js.native
    
    def setoption(name: String): js.Promise[Engine] = js.native
    def setoption(name: String, value: String): js.Promise[Engine] = js.native
    
    def stop(): js.Promise[SearchResult] = js.native
    
    def ucinewgame(): js.Promise[Engine] = js.native
    
    def write(cmd: String): Unit = js.native
  }
  
  @JSImport("node-uci", "EngineChain")
  @js.native
  open class EngineChain protected () extends StObject {
    def this(engine: Engine) = this()
    
    def exec(): Any = js.native
    
    def go(sp: SearchOptions): js.Promise[SearchResult] = js.native
    
    def init(): EngineChain = js.native
    
    def isready(): EngineChain = js.native
    
    def position(fen: String): EngineChain = js.native
    def position(fen: String, moves: js.Array[String]): EngineChain = js.native
    
    def quit(): EngineChain = js.native
    
    def setoption(name: String): EngineChain = js.native
    def setoption(name: String, value: String): EngineChain = js.native
    
    def ucinewgame(): EngineChain = js.native
  }
  
  trait SearchOptions extends StObject {
    
    var binc: js.UndefOr[Double] = js.undefined
    
    var btime: js.UndefOr[Double] = js.undefined
    
    var depth: js.UndefOr[Double] = js.undefined
    
    var mate: js.UndefOr[Double] = js.undefined
    
    var movestogo: js.UndefOr[Double] = js.undefined
    
    var movetime: js.UndefOr[Double] = js.undefined
    
    var nodes: js.UndefOr[Double] = js.undefined
    
    var ponder: js.UndefOr[Boolean] = js.undefined
    
    var searchmoves: js.UndefOr[js.Array[String]] = js.undefined
    
    var winc: js.UndefOr[Double] = js.undefined
    
    var wtime: js.UndefOr[Double] = js.undefined
  }
  object SearchOptions {
    
    inline def apply(): SearchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchOptions] (val x: Self) extends AnyVal {
      
      inline def setBinc(value: Double): Self = StObject.set(x, "binc", value.asInstanceOf[js.Any])
      
      inline def setBincUndefined: Self = StObject.set(x, "binc", js.undefined)
      
      inline def setBtime(value: Double): Self = StObject.set(x, "btime", value.asInstanceOf[js.Any])
      
      inline def setBtimeUndefined: Self = StObject.set(x, "btime", js.undefined)
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setMate(value: Double): Self = StObject.set(x, "mate", value.asInstanceOf[js.Any])
      
      inline def setMateUndefined: Self = StObject.set(x, "mate", js.undefined)
      
      inline def setMovestogo(value: Double): Self = StObject.set(x, "movestogo", value.asInstanceOf[js.Any])
      
      inline def setMovestogoUndefined: Self = StObject.set(x, "movestogo", js.undefined)
      
      inline def setMovetime(value: Double): Self = StObject.set(x, "movetime", value.asInstanceOf[js.Any])
      
      inline def setMovetimeUndefined: Self = StObject.set(x, "movetime", js.undefined)
      
      inline def setNodes(value: Double): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
      
      inline def setPonder(value: Boolean): Self = StObject.set(x, "ponder", value.asInstanceOf[js.Any])
      
      inline def setPonderUndefined: Self = StObject.set(x, "ponder", js.undefined)
      
      inline def setSearchmoves(value: js.Array[String]): Self = StObject.set(x, "searchmoves", value.asInstanceOf[js.Any])
      
      inline def setSearchmovesUndefined: Self = StObject.set(x, "searchmoves", js.undefined)
      
      inline def setSearchmovesVarargs(value: String*): Self = StObject.set(x, "searchmoves", js.Array(value*))
      
      inline def setWinc(value: Double): Self = StObject.set(x, "winc", value.asInstanceOf[js.Any])
      
      inline def setWincUndefined: Self = StObject.set(x, "winc", js.undefined)
      
      inline def setWtime(value: Double): Self = StObject.set(x, "wtime", value.asInstanceOf[js.Any])
      
      inline def setWtimeUndefined: Self = StObject.set(x, "wtime", js.undefined)
    }
  }
  
  trait SearchResult extends StObject {
    
    var bestmove: String
    
    var info: js.Array[String]
  }
  object SearchResult {
    
    inline def apply(bestmove: String, info: js.Array[String]): SearchResult = {
      val __obj = js.Dynamic.literal(bestmove = bestmove.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchResult] (val x: Self) extends AnyVal {
      
      inline def setBestmove(value: String): Self = StObject.set(x, "bestmove", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: js.Array[String]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoVarargs(value: String*): Self = StObject.set(x, "info", js.Array(value*))
    }
  }
}
