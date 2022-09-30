package typings.nodegit

import typings.nodegit.nodegitInts.`0`
import typings.nodegit.nodegitInts.`10`
import typings.nodegit.nodegitInts.`11`
import typings.nodegit.nodegitInts.`12`
import typings.nodegit.nodegitInts.`1`
import typings.nodegit.nodegitInts.`2`
import typings.nodegit.nodegitInts.`3`
import typings.nodegit.nodegitInts.`4`
import typings.nodegit.nodegitInts.`5`
import typings.nodegit.nodegitInts.`6`
import typings.nodegit.nodegitInts.`7`
import typings.nodegit.nodegitInts.`8`
import typings.nodegit.nodegitInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGit2Mod {
  
  @JSImport("nodegit/lib-git2", "Libgit2")
  @js.native
  open class Libgit2 () extends StObject
  /* static members */
  object Libgit2 {
    
    @JSImport("nodegit/lib-git2", "Libgit2")
    @js.native
    val ^ : js.Any = js.native
    
    inline def features(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("features")().asInstanceOf[Double]
    
    inline def init(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Double]
    
    inline def opts(option: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("opts")(option.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def shutdown(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("shutdown")().asInstanceOf[Double]
    
    inline def version(major: Double, minor: Double, rev: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("version")(major.asInstanceOf[js.Any], minor.asInstanceOf[js.Any], rev.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitInts.`0`
      - typings.nodegit.nodegitInts.`1`
      - typings.nodegit.nodegitInts.`2`
      - typings.nodegit.nodegitInts.`3`
      - typings.nodegit.nodegitInts.`4`
      - typings.nodegit.nodegitInts.`5`
      - typings.nodegit.nodegitInts.`6`
      - typings.nodegit.nodegitInts.`7`
      - typings.nodegit.nodegitInts.`8`
      - typings.nodegit.nodegitInts.`9`
      - typings.nodegit.nodegitInts.`10`
      - typings.nodegit.nodegitInts.`11`
      - typings.nodegit.nodegitInts.`12`
    */
    trait OPT extends StObject
    object OPT {
      
      inline def ENABLE_CACHING: `8` = 8.asInstanceOf[`8`]
      
      inline def GET_CACHED_MEMORY: `9` = 9.asInstanceOf[`9`]
      
      inline def GET_MWINDOW_MAPPED_LIMIT: `2` = 2.asInstanceOf[`2`]
      
      inline def GET_MWINDOW_SIZE: `0` = 0.asInstanceOf[`0`]
      
      inline def GET_SEARCH_PATH: `4` = 4.asInstanceOf[`4`]
      
      inline def GET_TEMPLATE_PATH: `10` = 10.asInstanceOf[`10`]
      
      inline def SET_CACHE_MAX_SIZE: `7` = 7.asInstanceOf[`7`]
      
      inline def SET_CACHE_OBJECT_LIMIT: `6` = 6.asInstanceOf[`6`]
      
      inline def SET_MWINDOW_MAPPED_LIMIT: `3` = 3.asInstanceOf[`3`]
      
      inline def SET_MWINDOW_SIZE: `1` = 1.asInstanceOf[`1`]
      
      inline def SET_SEARCH_PATH: `5` = 5.asInstanceOf[`5`]
      
      inline def SET_SSL_CERT_LOCATIONS: `12` = 12.asInstanceOf[`12`]
      
      inline def SET_TEMPLATE_PATH: `11` = 11.asInstanceOf[`11`]
    }
  }
}
