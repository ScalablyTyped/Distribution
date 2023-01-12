package typings.nodeSqlParser

import typings.nodeSqlParser.nodeSqlParserStrings.Equalssign
import typings.nodeSqlParser.nodeSqlParserStrings.`using`
import typings.nodeSqlParser.nodeSqlParserStrings.algorithm
import typings.nodeSqlParser.nodeSqlParserStrings.alter
import typings.nodeSqlParser.nodeSqlParserStrings.btree
import typings.nodeSqlParser.nodeSqlParserStrings.copy
import typings.nodeSqlParser.nodeSqlParserStrings.default
import typings.nodeSqlParser.nodeSqlParserStrings.exclusive
import typings.nodeSqlParser.nodeSqlParserStrings.hash
import typings.nodeSqlParser.nodeSqlParserStrings.inplace
import typings.nodeSqlParser.nodeSqlParserStrings.instant
import typings.nodeSqlParser.nodeSqlParserStrings.like
import typings.nodeSqlParser.nodeSqlParserStrings.lock
import typings.nodeSqlParser.nodeSqlParserStrings.none
import typings.nodeSqlParser.nodeSqlParserStrings.shared
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Algorithm extends StObject {
    
    var algorithm: default | instant | inplace | copy
    
    var keyword: algorithm
    
    var resource: algorithm
    
    var symbol: Equalssign | Null
    
    var `type`: alter
  }
  object Algorithm {
    
    inline def apply(algorithm: default | instant | inplace | copy): Algorithm = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], keyword = "algorithm", resource = "algorithm", symbol = null)
      __obj.updateDynamic("type")("alter")
      __obj.asInstanceOf[Algorithm]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Algorithm] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: default | instant | inplace | copy): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setKeyword(value: algorithm): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setResource(value: algorithm): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: Equalssign): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolNull: Self = StObject.set(x, "symbol", null)
      
      inline def setType(value: alter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Db extends StObject {
    
    var db: String
    
    var table: String
  }
  object Db {
    
    inline def apply(db: String, table: String): Db = {
      val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[Db]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Db] (val x: Self) extends AnyVal {
      
      inline def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  trait Keyword extends StObject {
    
    var keyword: `using`
    
    var `type`: btree | hash
  }
  object Keyword {
    
    inline def apply(`type`: btree | hash): Keyword = {
      val __obj = js.Dynamic.literal(keyword = "using")
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Keyword]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Keyword] (val x: Self) extends AnyVal {
      
      inline def setKeyword(value: `using`): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setType(value: btree | hash): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Lock extends StObject {
    
    var keyword: lock
    
    var lock: default | none | shared | exclusive
    
    var resource: lock
    
    var symbol: Equalssign | Null
    
    var `type`: alter
  }
  object Lock {
    
    inline def apply(lock: default | none | shared | exclusive): Lock = {
      val __obj = js.Dynamic.literal(keyword = "lock", lock = lock.asInstanceOf[js.Any], resource = "lock", symbol = null)
      __obj.updateDynamic("type")("alter")
      __obj.asInstanceOf[Lock]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Lock] (val x: Self) extends AnyVal {
      
      inline def setKeyword(value: lock): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setLock(value: default | none | shared | exclusive): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
      
      inline def setResource(value: lock): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: Equalssign): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolNull: Self = StObject.set(x, "symbol", null)
      
      inline def setType(value: alter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Parentheses extends StObject {
    
    var parentheses: js.UndefOr[Boolean] = js.undefined
    
    var table: String
    
    var `type`: like
  }
  object Parentheses {
    
    inline def apply(table: String): Parentheses = {
      val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("like")
      __obj.asInstanceOf[Parentheses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Parentheses] (val x: Self) extends AnyVal {
      
      inline def setParentheses(value: Boolean): Self = StObject.set(x, "parentheses", value.asInstanceOf[js.Any])
      
      inline def setParenthesesUndefined: Self = StObject.set(x, "parentheses", js.undefined)
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setType(value: like): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
