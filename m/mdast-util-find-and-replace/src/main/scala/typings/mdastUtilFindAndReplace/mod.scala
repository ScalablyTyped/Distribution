package typings.mdastUtilFindAndReplace

import typings.mdastUtilFindAndReplace.libMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-find-and-replace", "findAndReplace")
  @js.native
  val findAndReplace: (js.Function4[
    /* tree */ Node, 
    /* find */ typings.mdastUtilFindAndReplace.libMod.Find, 
    /* replace */ js.UndefOr[typings.mdastUtilFindAndReplace.libMod.Replace], 
    /* options */ js.UndefOr[typings.mdastUtilFindAndReplace.libMod.Options], 
    Node
  ]) & (js.Function3[
    /* tree */ Node, 
    /* schema */ typings.mdastUtilFindAndReplace.libMod.FindAndReplaceSchema | typings.mdastUtilFindAndReplace.libMod.FindAndReplaceList, 
    /* options */ js.UndefOr[typings.mdastUtilFindAndReplace.libMod.Options], 
    Node
  ]) = js.native
  
  type Find = typings.mdastUtilFindAndReplace.libMod.Find
  
  type FindAndReplaceList = typings.mdastUtilFindAndReplace.libMod.FindAndReplaceList
  
  type FindAndReplaceSchema = typings.mdastUtilFindAndReplace.libMod.FindAndReplaceSchema
  
  type FindAndReplaceTuple = typings.mdastUtilFindAndReplace.libMod.FindAndReplaceTuple
  
  type Options = typings.mdastUtilFindAndReplace.libMod.Options
  
  type RegExpMatchObject = typings.mdastUtilFindAndReplace.libMod.RegExpMatchObject
  
  type Replace = typings.mdastUtilFindAndReplace.libMod.Replace
  
  type ReplaceFunction = typings.mdastUtilFindAndReplace.libMod.ReplaceFunction
}
