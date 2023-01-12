package typings.pinoAbstractTransport

import typings.node.streamMod.Transform
import typings.pinoAbstractTransport.pinoAbstractTransportBooleans.`false`
import typings.pinoAbstractTransport.pinoAbstractTransportBooleans.`true`
import typings.pinoAbstractTransport.pinoAbstractTransportStrings.lines
import typings.pinoAbstractTransport.pinoAbstractTransportStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pino-abstract-transport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a split2 instance and returns it. This same instance is also passed
    * to the given function, which is called synchronously.
    *
    * @returns {Transform} the split2 instance
    */
  inline def default(fn: js.Function1[/* transform */ Transform & OnUnknown, Unit | js.Promise[Unit]]): Transform & OnUnknown = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[Transform & OnUnknown]
  inline def default(
    fn: js.Function1[/* transform */ Transform & OnUnknown, Unit | js.Promise[Unit]],
    opts: BuildOptions
  ): Transform & OnUnknown = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Transform & OnUnknown]
  /**
    * Creates a split2 instance and passes it to the given function, which is called
    * synchronously. Then wraps the split2 instance and the returned stream into a
    * Duplex, so they can be concatenated into multiple transports.
    *
    * @returns {Transform} the wrapped split2 instance
    */
  inline def default(
    fn: js.Function1[/* transform */ Transform & OnUnknown, Transform & OnUnknown],
    opts: EnablePipelining
  ): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Transform]
  
  trait BuildOptions extends StObject {
    
    /**
      * `close(err, cb)` a function that is called to shutdown the transport.
      * It's called both on error and non-error shutdowns. It can also return
      * a promise. In this case discard the the cb argument.
      *
      * @example
      * ```typescript
      * {
      *   close: function (err, cb) {
      *     process.nextTick(cb, err)
      *   }
      * }
      * ```
      * */
    var close: js.UndefOr[js.Function2[/* err */ js.Error, /* cb */ js.Function, Unit | js.Promise[Unit]]] = js.undefined
    
    /**
      * `metadata` If set to false, do not add metadata properties to the returned stream
      */
    var metadata: js.UndefOr[`false`] = js.undefined
    
    /**
      * `parse` an option to change to data format passed to build function.
      * @default undefined
      *
      */
    var parse: js.UndefOr[lines] = js.undefined
    
    /**
      * `parseLine(line)` a function that is used to parse line received from pino.
      * @default JSON.parse
      */
    var parseLine: js.UndefOr[js.Function1[/* line */ String, Any]] = js.undefined
  }
  object BuildOptions {
    
    inline def apply(): BuildOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuildOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BuildOptions] (val x: Self) extends AnyVal {
      
      inline def setClose(value: (/* err */ js.Error, /* cb */ js.Function) => Unit | js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction2(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setMetadata(value: `false`): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setParse(value: lines): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setParseLine(value: /* line */ String => Any): Self = StObject.set(x, "parseLine", js.Any.fromFunction1(value))
      
      inline def setParseLineUndefined: Self = StObject.set(x, "parseLine", js.undefined)
      
      inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    }
  }
  
  /**
    * Pass these options to wrap the split2 stream and
    * the returned stream into a Duplex
    */
  trait EnablePipelining
    extends StObject
       with BuildOptions {
    
    var enablePipelining: `true`
  }
  object EnablePipelining {
    
    inline def apply(): EnablePipelining = {
      val __obj = js.Dynamic.literal(enablePipelining = true)
      __obj.asInstanceOf[EnablePipelining]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnablePipelining] (val x: Self) extends AnyVal {
      
      inline def setEnablePipelining(value: `true`): Self = StObject.set(x, "enablePipelining", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnUnknown extends StObject {
    
    /**
      * `unknown` is the event emitted where an unparsable line is found
      *
      * @param event 'unknown'
      * @param line the unparsable line
      * @param error the error that was thrown when parsing the line
      */
    @JSName("on")
    def on_unknown(event: unknown, listener: js.Function2[/* line */ String, /* error */ Any, Unit]): Unit
  }
  object OnUnknown {
    
    inline def apply(on: (unknown, js.Function2[/* line */ String, /* error */ Any, Unit]) => Unit): OnUnknown = {
      val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
      __obj.asInstanceOf[OnUnknown]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnUnknown] (val x: Self) extends AnyVal {
      
      inline def setOn(value: (unknown, js.Function2[/* line */ String, /* error */ Any, Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
}
