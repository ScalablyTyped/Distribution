package typings.osmosis

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("osmosis", JSImport.Namespace)
  @js.native
  val ^ : Osmosis = js.native
  
  @js.native
  trait Osmosis extends StObject {
    
    /**
      * Set configuration options for the **preceeding** command on down the chain.
      */
    def config(option: String): Osmosis = js.native
    def config(option: String, value: js.Any): Osmosis = js.native
    def config(option: StringDictionary[js.Any]): Osmosis = js.native
    def config(option: StringDictionary[js.Any], value: js.Any): Osmosis = js.native
    
    /**
      * Set a cookie. Short for `.config({ cookies: ... })`. Note: Setting a cookie to `null` will delete the cookie.
      */
    def cookie(name: String): Osmosis = js.native
    def cookie(name: String, value: String): Osmosis = js.native
    
    /**
      * passing string to your function
      * result data, osmosis finished
      */
    def data(callback: js.Function1[/* param */ js.Any, _]): Osmosis = js.native
    
    /**
      * passing string to your function
      * debug data
      */
    def debug(callback: js.Function1[/* param */ String, _]): Osmosis = js.native
    
    /**
      * Call a callback when the Osmosis instance has completely finished.
      */
    def done(callback: js.Function0[_]): Osmosis = js.native
    
    /**
      * passing string to your function
      * error data
      */
    def error(callback: js.Function1[/* param */ String, _]): Osmosis = js.native
    
    /**
      * find DOM by selector
      */
    def find(selector: String): Osmosis = js.native
    
    /**
      * follw links, founded href or src
      * @param selector '@href' or '@src', default '@href'
      */
    def follow(selector: String): Osmosis = js.native
    
    /**
      * define domain where osmosis is parsing data from
      */
    def get(url: String): Osmosis = js.native
    
    /**
      * Set an HTTP header. Short for `.config({ headers: ... })`
      */
    def header(name: String, value: String): Osmosis = js.native
    
    /**
      * Set multiple HTTP headers. Short for `.config({ headers: ... })`.
      */
    def headers(headers: StringDictionary[String]): Osmosis = js.native
    
    /**
      * passing string to your function
      * log data
      */
    def log(callback: js.Function1[/* param */ String, _]): Osmosis = js.native
    
    /**
      * paginate followed url
      */
    def paginate(selector: String): Osmosis = js.native
    
    /**
      * set scrapped data as result,
      * 1. string, after find function set data by selector as value with this string as key
      * 2. object, define any json object
      */
    def set(json: String): Osmosis = js.native
    def set(json: js.Object): Osmosis = js.native
  }
  
  type _To = Osmosis
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Osmosis = ^
}
