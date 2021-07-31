package typings.nodegit

import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.nodegitNumbers.`10`
import typings.nodegit.nodegitNumbers.`11`
import typings.nodegit.nodegitNumbers.`12`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`3`
import typings.nodegit.nodegitNumbers.`4`
import typings.nodegit.nodegitNumbers.`5`
import typings.nodegit.nodegitNumbers.`6`
import typings.nodegit.nodegitNumbers.`7`
import typings.nodegit.nodegitNumbers.`8`
import typings.nodegit.nodegitNumbers.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGit2Mod {
  
  @JSImport("nodegit/lib-git2", "Libgit2")
  @js.native
  class Libgit2 () extends StObject
  /* static members */
  object Libgit2 {
    
    @JSImport("nodegit/lib-git2", "Libgit2")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def features(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("features")().asInstanceOf[Double]
    
    @scala.inline
    def init(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Double]
    
    @scala.inline
    def opts(option: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("opts")(option.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def shutdown(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("shutdown")().asInstanceOf[Double]
    
    @scala.inline
    def version(major: Double, minor: Double, rev: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("version")(major.asInstanceOf[js.Any], minor.asInstanceOf[js.Any], rev.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`3`
      - typings.nodegit.nodegitNumbers.`4`
      - typings.nodegit.nodegitNumbers.`5`
      - typings.nodegit.nodegitNumbers.`6`
      - typings.nodegit.nodegitNumbers.`7`
      - typings.nodegit.nodegitNumbers.`8`
      - typings.nodegit.nodegitNumbers.`9`
      - typings.nodegit.nodegitNumbers.`10`
      - typings.nodegit.nodegitNumbers.`11`
      - typings.nodegit.nodegitNumbers.`12`
    */
    trait OPT extends StObject
    object OPT {
      
      @scala.inline
      def ENABLE_CACHING: `8` = 8.asInstanceOf[`8`]
      
      @scala.inline
      def GET_CACHED_MEMORY: `9` = 9.asInstanceOf[`9`]
      
      @scala.inline
      def GET_MWINDOW_MAPPED_LIMIT: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def GET_MWINDOW_SIZE: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def GET_SEARCH_PATH: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def GET_TEMPLATE_PATH: `10` = 10.asInstanceOf[`10`]
      
      @scala.inline
      def SET_CACHE_MAX_SIZE: `7` = 7.asInstanceOf[`7`]
      
      @scala.inline
      def SET_CACHE_OBJECT_LIMIT: `6` = 6.asInstanceOf[`6`]
      
      @scala.inline
      def SET_MWINDOW_MAPPED_LIMIT: `3` = 3.asInstanceOf[`3`]
      
      @scala.inline
      def SET_MWINDOW_SIZE: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def SET_SEARCH_PATH: `5` = 5.asInstanceOf[`5`]
      
      @scala.inline
      def SET_SSL_CERT_LOCATIONS: `12` = 12.asInstanceOf[`12`]
      
      @scala.inline
      def SET_TEMPLATE_PATH: `11` = 11.asInstanceOf[`11`]
    }
  }
}
