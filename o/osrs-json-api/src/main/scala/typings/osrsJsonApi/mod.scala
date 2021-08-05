package typings.osrsJsonApi

import typings.osrsJsonApi.anon.AbyssalSire
import typings.osrsJsonApi.anon.Agility
import typings.osrsJsonApi.anon.All
import typings.osrsJsonApi.anon.Current
import typings.osrsJsonApi.anon.Hunter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object ge {
    
    @JSImport("osrs-json-api", "ge")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getGraph(id: Double): js.Promise[Graph] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGraph")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Graph]]
    
    inline def getItem(id: Double): js.Promise[Item] = ^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Item]]
    
    trait Graph extends StObject {
      
      var average: TimestampPriceRecord
      
      var daily: TimestampPriceRecord
    }
    object Graph {
      
      inline def apply(average: TimestampPriceRecord, daily: TimestampPriceRecord): Graph = {
        val __obj = js.Dynamic.literal(average = average.asInstanceOf[js.Any], daily = daily.asInstanceOf[js.Any])
        __obj.asInstanceOf[Graph]
      }
      
      extension [Self <: Graph](x: Self) {
        
        inline def setAverage(value: TimestampPriceRecord): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
        
        inline def setDaily(value: TimestampPriceRecord): Self = StObject.set(x, "daily", value.asInstanceOf[js.Any])
      }
    }
    
    trait Item extends StObject {
      
      var item: Current
    }
    object Item {
      
      inline def apply(item: Current): Item = {
        val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
        __obj.asInstanceOf[Item]
      }
      
      extension [Self <: Item](x: Self) {
        
        inline def setItem(value: Current): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      }
    }
    
    type TimestampPriceRecord = Record[String, Double]
    
    trait TrendPriceObject extends StObject {
      
      var price: Double
      
      var trend: String
    }
    object TrendPriceObject {
      
      inline def apply(price: Double, trend: String): TrendPriceObject = {
        val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any], trend = trend.asInstanceOf[js.Any])
        __obj.asInstanceOf[TrendPriceObject]
      }
      
      extension [Self <: TrendPriceObject](x: Self) {
        
        inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
        
        inline def setTrend(value: String): Self = StObject.set(x, "trend", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object hiscores {
    
    @JSImport("osrs-json-api", "hiscores")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getPlayer(rsn: String): js.Promise[Player] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlayer")(rsn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Player]]
    inline def getPlayer(rsn: String, gamemode: Gamemodes): js.Promise[Player] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlayer")(rsn.asInstanceOf[js.Any], gamemode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Player]]
    
    /* Rewritten from type alias, can be one of: 
      - typings.osrsJsonApi.osrsJsonApiStrings.main
      - typings.osrsJsonApi.osrsJsonApiStrings.iron
      - typings.osrsJsonApi.osrsJsonApiStrings.uim
      - typings.osrsJsonApi.osrsJsonApiStrings.hcim
      - typings.osrsJsonApi.osrsJsonApiStrings.dmm
      - typings.osrsJsonApi.osrsJsonApiStrings.sdmm
      - typings.osrsJsonApi.osrsJsonApiStrings.dmmt
    */
    trait Gamemodes extends StObject
    object Gamemodes {
      
      inline def dmm: typings.osrsJsonApi.osrsJsonApiStrings.dmm = "dmm".asInstanceOf[typings.osrsJsonApi.osrsJsonApiStrings.dmm]
      
      inline def dmmt: typings.osrsJsonApi.osrsJsonApiStrings.dmmt = "dmmt".asInstanceOf[typings.osrsJsonApi.osrsJsonApiStrings.dmmt]
      
      inline def hcim: typings.osrsJsonApi.osrsJsonApiStrings.hcim = "hcim".asInstanceOf[typings.osrsJsonApi.osrsJsonApiStrings.hcim]
      
      inline def iron: typings.osrsJsonApi.osrsJsonApiStrings.iron = "iron".asInstanceOf[typings.osrsJsonApi.osrsJsonApiStrings.iron]
      
      inline def main: typings.osrsJsonApi.osrsJsonApiStrings.main = "main".asInstanceOf[typings.osrsJsonApi.osrsJsonApiStrings.main]
      
      inline def sdmm: typings.osrsJsonApi.osrsJsonApiStrings.sdmm = "sdmm".asInstanceOf[typings.osrsJsonApi.osrsJsonApiStrings.sdmm]
      
      inline def uim: typings.osrsJsonApi.osrsJsonApiStrings.uim = "uim".asInstanceOf[typings.osrsJsonApi.osrsJsonApiStrings.uim]
    }
    
    trait Player extends StObject {
      
      var bh: Hunter
      
      var bosses: AbyssalSire
      
      var clues: All
      
      var lms: RankScoreObject
      
      var skills: Agility
    }
    object Player {
      
      inline def apply(bh: Hunter, bosses: AbyssalSire, clues: All, lms: RankScoreObject, skills: Agility): Player = {
        val __obj = js.Dynamic.literal(bh = bh.asInstanceOf[js.Any], bosses = bosses.asInstanceOf[js.Any], clues = clues.asInstanceOf[js.Any], lms = lms.asInstanceOf[js.Any], skills = skills.asInstanceOf[js.Any])
        __obj.asInstanceOf[Player]
      }
      
      extension [Self <: Player](x: Self) {
        
        inline def setBh(value: Hunter): Self = StObject.set(x, "bh", value.asInstanceOf[js.Any])
        
        inline def setBosses(value: AbyssalSire): Self = StObject.set(x, "bosses", value.asInstanceOf[js.Any])
        
        inline def setClues(value: All): Self = StObject.set(x, "clues", value.asInstanceOf[js.Any])
        
        inline def setLms(value: RankScoreObject): Self = StObject.set(x, "lms", value.asInstanceOf[js.Any])
        
        inline def setSkills(value: Agility): Self = StObject.set(x, "skills", value.asInstanceOf[js.Any])
      }
    }
    
    trait RankLevelXpObject extends StObject {
      
      var level: Double
      
      var rank: String
      
      var xp: Double
    }
    object RankLevelXpObject {
      
      inline def apply(level: Double, rank: String, xp: Double): RankLevelXpObject = {
        val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], xp = xp.asInstanceOf[js.Any])
        __obj.asInstanceOf[RankLevelXpObject]
      }
      
      extension [Self <: RankLevelXpObject](x: Self) {
        
        inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
        
        inline def setRank(value: String): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
        
        inline def setXp(value: Double): Self = StObject.set(x, "xp", value.asInstanceOf[js.Any])
      }
    }
    
    trait RankScoreObject extends StObject {
      
      var rank: Double
      
      var score: Double
    }
    object RankScoreObject {
      
      inline def apply(rank: Double, score: Double): RankScoreObject = {
        val __obj = js.Dynamic.literal(rank = rank.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
        __obj.asInstanceOf[RankScoreObject]
      }
      
      extension [Self <: RankScoreObject](x: Self) {
        
        inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
        
        inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      }
    }
  }
}
